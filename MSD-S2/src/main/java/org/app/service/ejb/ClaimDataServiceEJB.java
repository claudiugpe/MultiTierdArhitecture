package org.app.service.ejb;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import org.app.patterns.EntityRepositoryBase;
import org.app.service.entities.Claim;

@Stateless @LocalBean
public class ClaimDataServiceEJB 
				extends EntityRepositoryBase<Claim>
				implements ClaimDataService
{
	private static Logger logger = Logger.getLogger(ClaimDataServiceEJB.class.getName());
	
	@PostConstruct
	public void init(){
		logger.info("Initialized :" + this.em);		
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Claim data service success";
	}

}
