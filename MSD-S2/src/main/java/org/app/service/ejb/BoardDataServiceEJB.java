package org.app.service.ejb;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import org.app.patterns.EntityRepositoryBase;
import org.app.service.entities.Board;

@Stateless @LocalBean
public class BoardDataServiceEJB 
				extends EntityRepositoryBase<Board>
				implements BoardDataService
{
	private static Logger logger = Logger.getLogger(BoardDataServiceEJB.class.getName());
	
	@PostConstruct
	public void init(){
		logger.info("Initialized :" + this.em);		
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Board data service success";
	}

}
