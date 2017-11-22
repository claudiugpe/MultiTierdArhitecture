package org.app.service.ejb;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import org.app.patterns.EntityRepositoryBase;
import org.app.service.entities.WorkItemPropertyValue;

@Stateless @LocalBean
public class WorkItemPropertyValueDataServiceEJB 
				extends EntityRepositoryBase<WorkItemPropertyValue>
				implements WorkItemPropertyValueDataService
{
	private static Logger logger = Logger.getLogger(WorkItemPropertyValueDataServiceEJB.class.getName());
	
	@PostConstruct
	public void init(){
		logger.info("Initialized :" + this.em);		
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Work Item Property Value data service success";
	}

}
