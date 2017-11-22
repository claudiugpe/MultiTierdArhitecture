package org.app.service.ejb;

import javax.ejb.Remote;

import org.app.patterns.EntityRepository;
import org.app.service.entities.Claim;

@Remote
public interface ClaimDataService extends EntityRepository<Claim>{
	String getMessage();
}
