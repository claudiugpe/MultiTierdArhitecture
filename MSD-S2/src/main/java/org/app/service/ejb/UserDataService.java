package org.app.service.ejb;

import javax.ejb.Remote;

import org.app.patterns.EntityRepository;
import org.app.service.entities.UserApp;

@Remote
public interface UserDataService extends EntityRepository<UserApp>{
	String getMessage();
}
