package org.app.service.ejb;

import javax.ejb.Remote;

import org.app.patterns.EntityRepository;
import org.app.service.entities.WorkItemType;

@Remote
public interface WorkItemTypeDataService extends EntityRepository<WorkItemType>{
	String getMessage();
}
