package org.app.service.ejb.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import javax.ejb.EJB;

import org.app.patterns.EntityRepository;
import org.app.service.ejb.WorkItemDataService;
import org.app.service.entities.WorkItem;
import org.app.service.entities.EntityBase;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestWorkItemDataServiceEJBArq  {
	private static Logger logger = Logger.getLogger(TestWorkItemDataServiceEJBArq.class.getName());
	
	@EJB
	private static WorkItemDataService service;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	
	
	@Deployment
	public static Archive<?> createDeployment() {
	        return ShrinkWrap
	                .create(WebArchive.class, "msd-test.war")
	                .addPackage(EntityRepository.class.getPackage())
	                .addPackage(WorkItemDataService.class.getPackage())
	                .addPackage(EntityBase.class.getPackage())
	                .addAsResource("META-INF/persistence.xml")
	                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
	   }
	
	@Test
	public void test() {
		logger.info("DEBUG: Junit TESTING WORKITEM DATA SERVICE...");
		String response = service.getMessage();
		assertNotNull("Work Item Data Service failed!", response);	
		logger.info("DEBUG: EJB Response ... " + response);
	}
	
	@Test
	public void test_GetWorkItems() {
		logger.info("DEBUG: Junit TESTING GET WORKITEM...");
		Collection<WorkItem> _workitems = service.toCollection();
		assertTrue("Failed to read Work Item!", _workitems.size() > 0);
		logger.info("DEBUG: GET WORKITEM DONE ");
	}
	
	@Test
	public void test_AddWorkItem() {
		logger.info("DEBUG: Junit TESTING ADD WORKITEM...");
		
		int initialSize = service.toCollection().size();
		service.add(new WorkItem(null, 1, "UserName1", "UserName1", new Date(), new Date(), false));
	
		Collection<WorkItem> _workitems = service.toCollection();
		assertTrue("Failed to add workitem!", _workitems.size() == ++initialSize);
		logger.info("DEBUG: ADD WORKITEM DONE ");
	}
	
	@Test
	public void test_DeleteWorkItem() {
		logger.info("DEBUG: Junit TESTING DELETE WORKITEM...");
		Collection<WorkItem> workitems = service.toCollection();
		
		for(WorkItem _workitem: workitems) {
			service.remove(_workitem);
		}
		
		Collection<WorkItem> remainingWorkItems = service.toCollection();
		
		assertTrue("Failed to delete workitems!", !remainingWorkItems.size());
		logger.info("DEBUG: DELETE WORKITEM DONE ");
	}
	
	@Test
	public void test_GetWorkItemById() {
		logger.info("DEBUG: Junit TESTING GET WORKITEM BY ID...");
		Collection<WorkItem> workitems = service.toCollection();
		
		List<Object> list = new ArrayList<Object>(workitems);
		WorkItem testWorkItem = (WorkItem)list.get(0);
		
		WorkItem WorkItemWanted = service.getById(testWorkItem.getId());
		
		assertTrue("Failed to get workitem by id...", WorkItemWanted.getId() == testWorkItem.getId());
		logger.info("DEBUG: GET WORKITEM BY ID DONE ");
	}
	
	}