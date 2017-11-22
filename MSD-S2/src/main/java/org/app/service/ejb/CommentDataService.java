package org.app.service.ejb;

import javax.ejb.Remote;

import org.app.patterns.EntityRepository;
import org.app.service.entities.Comment;

@Remote
public interface CommentDataService extends EntityRepository<Comment>{
	String getMessage();
}
