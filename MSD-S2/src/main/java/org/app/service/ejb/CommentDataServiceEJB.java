package org.app.service.ejb;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import org.app.patterns.EntityRepositoryBase;
import org.app.service.entities.Comment;

@Stateless @LocalBean
public class CommentDataServiceEJB 
				extends EntityRepositoryBase<Comment>
				implements CommentDataService
{
	private static Logger logger = Logger.getLogger(CommentDataServiceEJB.class.getName());
	
	@PostConstruct
	public void init(){
		logger.info("Initialized :" + this.em);		
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Comment data service success";
	}

}
