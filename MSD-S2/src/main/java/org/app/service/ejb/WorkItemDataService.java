package org.app.service.ejb;

import javax.ejb.Remote;

import org.app.patterns.EntityRepository;
import org.app.service.entities.WorkItem;

@Remote
public interface WorkItemDataService extends EntityRepository<WorkItem>{
	String getMessage();
}
