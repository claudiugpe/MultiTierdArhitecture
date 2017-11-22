package org.app.service.ejb;

import javax.ejb.Remote;

import org.app.patterns.EntityRepository;
import org.app.service.entities.Label;

@Remote
public interface LabelDataService extends EntityRepository<Label>{
	String getMessage();
}
