package org.app.service.ejb.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import javax.ejb.EJB;

import org.app.patterns.EntityRepository;
import org.app.service.entities.EntityBase;
import org.app.service.ejb.UserDataService;
import org.app.service.entities.UserApp;

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
public class TestUserDataServiceEJBArq  {
	private static Logger logger = Logger.getLogger(TestUserDataServiceEJBArq.class.getName());
	
	@EJB
	private static UserDataService service;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	
	
	@Deployment
	public static Archive<?> createDeployment() {
	        return ShrinkWrap
	                .create(WebArchive.class, "msd-test.war")
	                .addPackage(EntityRepository.class.getPackage())
	                .addPackage(UserDataService.class.getPackage())
	                .addPackage(EntityBase.class.getPackage())
	                .addAsResource("META-INF/persistence.xml")
	                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
	   }
	
	@Test
	public void test() {
		logger.info("DEBUG: Junit TESTING USER DATA SERVICE...");
		String response = service.getMessage();
		assertNotNull("User Data Service failed!", response);	
		logger.info("DEBUG: EJB Response ... " + response);
	}
	
	
	@Test
	public void test_GetUser() {
		logger.info("DEBUG: Junit TESTING GET USER...");
		Collection<UserApp> _user = service.toCollection();
		assertTrue("Failed to get user!", _user.size() > 0);
		logger.info("DEBUG: GET USER DONE ");
	}
	
	
	@Test
	public void test_AddUserData() {
		logger.info("DEBUG: Junit TESTING ADD USER ...");
		int initialUsers = service.toCollection().size();
		
		service.add(new UserApp(null, 1, "UserName1", "UserName1", new Date(), new Date(), 0));
		assertTrue("Failed to add the user!", service.toCollection().size() == ++initialUsers);
		logger.info("DEBUG: ADD USER DONE ");
	}
	
	@Test
	public void test_removeUser() {
		logger.info("DEBUG: Junit TESTING REMOVE USER...");
		Collection<UserApp> users = service.toCollection();
		int initialUsers = service.toCollection().size();
		
		for(UserApp _user: users) {
			service.remove(_user);
		}
		
		Collection<UserApp> remainingUsers = service.toCollection();
		assertTrue("Failed to remove users!", !remainingBoards.size());
		logger.info("DEBUG: REMOVE USER DONE ");
	}
	
	@Test
	public void test_GetUserById() {
		logger.info("DEBUG: Junit TESTING GET USER BY ID...");
		Collection<UserApp> users = service.toCollection();
		
		List<Object> list = new ArrayList<Object>(users);
		UserApp testUser = (UserApp)list.get(0);
		
		UserApp userWanted = service.getById(testUser.getId());
		
		assertTrue("Failed to get user with id ...", userWanted.getId() == testUser.getId());
		logger.info("DEBUG: GET USER BY ID DONE ");
	}
	
	
	}