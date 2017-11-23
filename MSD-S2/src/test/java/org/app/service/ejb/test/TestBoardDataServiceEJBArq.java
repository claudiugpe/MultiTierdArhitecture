package org.app.service.ejb.test;

import java.util.Collection;
import java.util.Date;
import java.util.logging.Logger;

import javax.ejb.EJB;

import org.app.patterns.EntityRepository;
import org.app.service.ejb.BoardDataService;
import org.app.service.entities.Board;
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
public class TestBoardDataServiceEJBArq {
	private static Logger logger = Logger.getLogger(TestBoardDataServiceEJBArq.class.getName());
	
	// Arquilian infrastructure
	@EJB
	private static BoardDataService service;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}	
	
	@Deployment
	public static Archive<?> createDeployment() {
	        return ShrinkWrap
	                .create(WebArchive.class, "msd-test.war")
	                .addPackage(EntityRepository.class.getPackage())
	                .addPackage(BoardDataService.class.getPackage())
	                .addPackage(EntityBase.class.getPackage())
	                .addAsResource("META-INF/persistence.xml")
	                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
	   }
	
	@Test
	public void test() {
		logger.info("DEBUG: Junit TESTING ...");
		String response = service.getMessage();
		assertNotNull("Data Service failed!", response);
		assertTrue("fail get message", response == "Board data service success");
		logger.info("DEBUG: EJB Response ..." + response);
	}
	
	@Test
	public void test_GetBoards() {
		logger.info("DEBUG: Junit TESTING GET BOARDS...");
		Collection<Board> boards = service.toCollection();
		assertTrue("Fail to read boards!", boards.size() > 0);
	}
	
	@Test
	public void test_AddBoard() {
		logger.info("DEBUG: Junit TESTING ADD BOARD...");
		
		int initialSize = service.toCollection().size();
		service.add(new Board(null, 1, "test", "test", new Date(), new Date(), false));
	
		Collection<Board> boards = service.toCollection();
		assertTrue("Fail to add board!", boards.size() == initialSize + 1);
	}
	
	@Test
	public void test_DeleteBoard() {
		logger.info("DEBUG: Junit TESTING DELETE BOARD...");
		Collection<Board> boards = service.toCollection();
		
		for(Board board: boards) {
			service.remove(board);
		}
		
		Collection<Board> remainingBoards = service.toCollection();
		
		assertTrue("Fail to delete boards!", remainingBoards.size() == 0);
	}
	
	@Test
	public void test_GetBoardById() {
		logger.info("DEBUG: Junit TESTING GET BOARD BY ID...");
		
		service.add(new Board(1, 1, "test", "test", new Date(), new Date(), false));		
		Board board = service.getById(1);
		
		assertTrue("Fail to get board by id!", board == null);

		service.remove(board);
	}
}
