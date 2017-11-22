package org.app.service.ejb;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import org.app.patterns.EntityRepositoryBase;
import org.app.service.entities.WorkItem;

@Stateless @LocalBean
public class WorkItemDataServiceEJB 
				extends EntityRepositoryBase<WorkItem>
				implements WorkItemDataService
{
	private static Logger logger = Logger.getLogger(WorkItemDataServiceEJB.class.getName());
	
	@PostConstruct
	public void init(){
		logger.info("Initialized :" + this.em);		
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Work Item data service success";
	}

}
