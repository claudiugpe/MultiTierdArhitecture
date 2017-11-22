package org.app.service.ejb;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import org.app.patterns.EntityRepositoryBase;
import org.app.service.entities.User;

@Stateless @LocalBean
public class UserDataServiceEJB 
				extends EntityRepositoryBase<User>
				implements UserDataService
{
	private static Logger logger = Logger.getLogger(UserDataServiceEJB.class.getName());
	
	@PostConstruct
	public void init(){
		logger.info("Initialized :" + this.em);		
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "User data service success";
	}

}
