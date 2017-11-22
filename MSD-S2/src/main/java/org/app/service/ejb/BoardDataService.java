package org.app.service.ejb;

import javax.ejb.Remote;

import org.app.patterns.EntityRepository;
import org.app.service.entities.Board;

@Remote
public interface BoardDataService extends EntityRepository<Board>{
	String getMessage();
}
