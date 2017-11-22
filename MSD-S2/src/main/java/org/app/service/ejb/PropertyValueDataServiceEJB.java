package org.app.service.ejb;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import org.app.patterns.EntityRepositoryBase;
import org.app.service.entities.PropertyValue;

@Stateless @LocalBean
public class PropertyValueDataServiceEJB 
				extends EntityRepositoryBase<PropertyValue>
				implements PropertyValueDataService
{
	private static Logger logger = Logger.getLogger(PropertyValueDataServiceEJB.class.getName());
	
	@PostConstruct
	public void init(){
		logger.info("Initialized :" + this.em);		
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Property Value data service success";
	}

}
