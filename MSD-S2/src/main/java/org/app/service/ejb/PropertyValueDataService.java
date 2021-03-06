package org.app.service.ejb;

import javax.ejb.Remote;

import org.app.patterns.EntityRepository;
import org.app.service.entities.PropertyValue;

@Remote
public interface PropertyValueDataService extends EntityRepository<PropertyValue>{
	String getMessage();
}
