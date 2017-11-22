package org.app.service.ejb;

import javax.ejb.Remote;

import org.app.patterns.EntityRepository;
import org.app.service.entities.WorkItemProperty;

@Remote
public interface WorkItemPropertyDataService extends EntityRepository<WorkItemProperty>{
	String getMessage();
}
