package org.app.service.ejb.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import javax.ejb.EJB;

import org.app.patterns.EntityRepository;
import org.app.service.ejb.SprintDataService;
import org.app.service.entities.Sprint;
import org.app.service.entities.EntityBase;


import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestSprintDataServiceEJBArq  {
	private static Logger logger = Logger.getLogger(TestSprintDataServiceEJBArq.class.getName());
	
	@EJB
	private static SprintDataService service;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	
	
	@Deployment
	public static Archive<?> createDeployment() {
	        return ShrinkWrap
	                .create(WebArchive.class, "msd-test.war")
	                .addPackage(EntityRepository.class.getPackage())
	                .addPackage(SprintDataService.class.getPackage())
	                .addPackage(EntityBase.class.getPackage())
	                .addAsResource("META-INF/persistence.xml")
	                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
	   }
	
	@Test
	public void test() {
		logger.info("DEBUG: Junit TESTING SPRINT DATA SERVICE...");
		String response = service.getMessage();
		assertNotNull("Sprint Data Service failed!", response);	
		logger.info("DEBUG: EJB Response ... " + response);
	}	
	
		@Test
	public void test_GetSprints() {
		logger.info("DEBUG: Junit TESTING GET SPRINT...");
		Collection<Sprint> _sprints = service.toCollection();
		assertTrue("Failed to read sprints!", _sprints.size() > 0);
		logger.info("DEBUG: GET SPRINT DONE ");
	}
	
	@Test
	public void test_AddSprint() {
		logger.info("DEBUG: Junit TESTING ADD SPRINT...");
		
		int initialSize = service.toCollection().size();
		Sprint sprint=new Sprint(null, 1, "UserName1", "UserName1", new Date(), new Date(), false);
		sprint.setTitle("test_sprint");
		sprint.setDescription("sprint description");
		service.add(sprint);
	
		Collection<Sprint> sprints = service.toCollection();
		assertTrue("Failed to add new sprint!", sprints.size() == ++initialSize);
		logger.info("DEBUG: ADD SPRINT DONE ");
	}
	
	@Test
	public void test_DeleteSprint() {
		logger.info("DEBUG: Junit TESTING DELETE SPRINT...");
		Collection<Sprint> sprints = service.toCollection();
		
		for(Sprint _sprint: sprints) {
			service.remove(_sprint);
		}
		
		Collection<Sprint> remainingSprints = service.toCollection();
		
		assertTrue("Failed to delete sprints!", remainingSprints.size() != 0);
		logger.info("DEBUG: REMOVE SPRINT DONE ");
	}
	
	@Test
	public void test_GetSprintById() {
		logger.info("DEBUG: Junit TESTING GET SPRINT BY ID...");
		Collection<Sprint> sprints = service.toCollection();
		
		List<Object> list = new ArrayList<Object>(sprints);
		Sprint testSprint = (Sprint)list.get(0);
		
		Sprint sprintWanted = service.getById(testSprint.getId());
		
		assertTrue("Failed to get sprint by id...", sprintWanted.getId() == testSprint.getId());
		logger.info("DEBUG: GET SPRINT BY ID DONE ");
	}
	
	}