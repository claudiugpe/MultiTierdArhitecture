package org.app.service.ejb;

import javax.ejb.Remote;
import org.app.patterns.EntityRepository;
import org.app.service.entities.BoardTemplate;

@Remote
public interface BoardTemplateDataService extends EntityRepository<BoardTemplate>{
	String getMessage();
}

