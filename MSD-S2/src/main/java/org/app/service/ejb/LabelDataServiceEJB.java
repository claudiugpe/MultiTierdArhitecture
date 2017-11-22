package org.app.service.ejb;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import org.app.patterns.EntityRepositoryBase;
import org.app.service.entities.Label;

@Stateless @LocalBean
public class LabelDataServiceEJB 
				extends EntityRepositoryBase<Label>
				implements LabelDataService
{
	private static Logger logger = Logger.getLogger(LabelDataServiceEJB.class.getName());
	
	@PostConstruct
	public void init(){
		logger.info("Initialized :" + this.em);		
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Label data service success";
	}

}
