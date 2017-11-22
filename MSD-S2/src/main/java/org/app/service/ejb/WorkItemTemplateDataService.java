package org.app.service.ejb;

import javax.ejb.Remote;

import org.app.patterns.EntityRepository;
import org.app.service.entities.WorkItemTemplate;

@Remote
public interface WorkItemTemplateDataService extends EntityRepository<WorkItemTemplate>{
	String getMessage();
}
