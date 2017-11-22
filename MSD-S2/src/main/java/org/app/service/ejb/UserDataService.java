package org.app.service.ejb;

import javax.ejb.Remote;

import org.app.patterns.EntityRepository;
import org.app.service.entities.User;

@Remote
public interface UserDataService extends EntityRepository<User>{
	String getMessage();
}
