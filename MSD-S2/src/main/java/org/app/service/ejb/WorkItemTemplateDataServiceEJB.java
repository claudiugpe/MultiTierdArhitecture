package org.app.service.ejb;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import org.app.patterns.EntityRepositoryBase;
import org.app.service.entities.WorkItemTemplate;

@Stateless @LocalBean
public class WorkItemTemplateDataServiceEJB
				extends EntityRepositoryBase<WorkItemTemplate>
				implements WorkItemTemplateDataService
{
	private static Logger logger = Logger.getLogger(WorkItemTemplateDataServiceEJB.class.getName());
	
	@PostConstruct
	public void init(){
		logger.info("Initialized :" + this.em);		
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Work Item Template data service success";
	}

}
