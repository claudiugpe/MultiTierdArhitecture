package org.app.service.ejb;

import javax.ejb.Remote;

import org.app.patterns.EntityRepository;
import org.app.service.entities.Sprint;

@Remote
public interface SprintDataService extends EntityRepository<Sprint>{
	String getMessage();
}
