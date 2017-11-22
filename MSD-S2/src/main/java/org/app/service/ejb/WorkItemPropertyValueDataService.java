package org.app.service.ejb;

import javax.ejb.Remote;

import org.app.patterns.EntityRepository;
import org.app.service.entities.WorkItemPropertyValue;

@Remote
public interface WorkItemPropertyValueDataService extends EntityRepository<WorkItemPropertyValue>{
	String getMessage();
}
