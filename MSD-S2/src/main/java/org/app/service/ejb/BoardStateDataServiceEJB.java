package org.app.service.ejb;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import org.app.patterns.EntityRepositoryBase;
import org.app.service.entities.BoardState;

@Stateless @LocalBean
public class BoardStateDataServiceEJB 
				extends EntityRepositoryBase<BoardState>
				implements BoardStateDataService
{
	private static Logger logger = Logger.getLogger(BoardStateDataServiceEJB.class.getName());
	
	@PostConstruct
	public void init(){
		logger.info("Initialized :" + this.em);		
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Board state data service success";
	}

}
