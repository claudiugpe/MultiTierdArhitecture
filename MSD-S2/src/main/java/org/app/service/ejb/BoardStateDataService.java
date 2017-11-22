package org.app.service.ejb;

import javax.ejb.Remote;

import org.app.patterns.EntityRepository;
import org.app.service.entities.BoardState;

@Remote
public interface BoardStateDataService extends EntityRepository<BoardState>{
	String getMessage();
}
