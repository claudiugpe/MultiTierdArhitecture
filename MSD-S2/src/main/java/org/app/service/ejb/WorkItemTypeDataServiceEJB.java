package org.app.service.ejb;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import org.app.patterns.EntityRepositoryBase;
import org.app.service.entities.WorkItemType;

@Stateless @LocalBean
public class WorkItemTypeDataServiceEJB 
				extends EntityRepositoryBase<WorkItemType>
				implements WorkItemTypeDataService
{
	private static Logger logger = Logger.getLogger(WorkItemTypeDataServiceEJB.class.getName());
	
	@PostConstruct
	public void init(){
		logger.info("Initialized :" + this.em);		
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Work Item Type data service success";
	}

}
