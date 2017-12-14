package org.app.service.ejb.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import javax.ejb.EJB;

import org.app.patterns.EntityRepository;
import org.app.service.ejb.ClaimDataService;
import org.app.service.entities.Claim;
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
public class TestClaimDataServiceEJBArq  {
	private static Logger logger = Logger.getLogger(TestClaimDataServiceEJBArq.class.getName());
	
	@EJB
	private static ClaimDataService service;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	
	
	@Deployment
	public static Archive<?> createDeployment() {
	        return ShrinkWrap
	                .create(WebArchive.class, "msd-test.war")
	                .addPackage(EntityRepository.class.getPackage())
	                .addPackage(ClaimDataService.class.getPackage())
	                .addPackage(EntityBase.class.getPackage())
	                .addAsResource("META-INF/persistence.xml")
	                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
	   }
	
	@Test
	public void test() {
		logger.info("DEBUG: Junit TESTING CLAIM DATA SERVICE...");
		String response = service.getMessage();
		assertNotNull("Claim Data Service failed!", response);	
		logger.info("DEBUG: EJB Response ... " + response);
	}
	
	@Test
	public void test_GetClaim() {
		logger.info("DEBUG: Junit TESTING GET CLAIM...");
		Collection<Claim> _claims = service.toCollection();
		assertTrue("Failed to read claims!", _claims.size() > 0);
		logger.info("DEBUG: GET CLAIM DONE ");
	}
	
	@Test
	public void test_AddClaim() {
		logger.info("DEBUG: Junit TESTING ADD CLAIM ...");
		int initialSize = service.toCollection().size();
		
		service.add(new Claim(null, 1, "UserName1", "UserName1", new Date(), new Date(), 0));
		assertTrue("Failed to add new Claim! ", service.toCollection().size() == ++initialSize);
		logger.info("DEBUG: ADD CLAIM DONE ");
	}
	
	@Test
	public void test_DeleteClaim() {
		logger.info("DEBUG: Junit TESTING DELETE CLAIM...");
		Collection<Claim> claims = service.toCollection();
		
		for(Claim _claim: claims) {
			service.remove(_claim);
		}
		
		Collection<Claim> remainingClaims = service.toCollection();
		assertTrue("Failed to delete claims!", !remainingClaims.size());
		logger.info("DEBUG: DELETE CLAIM DONE ");
	}
	
	@Test
	public void test_GetClaimById() {
		logger.info("DEBUG: Junit TESTING GET CLAIM BY ID...");
		Collection<Claim> claims = service.toCollection();
		
		List<Object> list = new ArrayList<Object>(claims);
		Claim testClaim = (Claim)list.get(0);
		
		Claim claimWanted = service.getById(testClaim.getId());
		
		assertTrue("Failed to get  id ...", claimWanted.getId() == testClaim.getId());
		logger.info("DEBUG: GET CLAIM BY ID DONE ");
	}
	
	}