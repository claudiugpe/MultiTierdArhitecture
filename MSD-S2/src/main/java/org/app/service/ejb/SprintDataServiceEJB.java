package org.app.service.ejb;

import java.util.Collection;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.app.patterns.EntityRepositoryBase;
import org.app.service.entities.Claim;
import org.app.service.entities.Sprint;

@Path("sprints")	
@Stateless @LocalBean
public class SprintDataServiceEJB 
				extends EntityRepositoryBase<Sprint>
				implements SprintDataService
{
	private static Logger logger = Logger.getLogger(SprintDataServiceEJB.class.getName());
	
	@PostConstruct
	public void init(){
		logger.info("Initialized :" + this.em);		
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Sprint data service success";
	}

	@POST
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Collection<Sprint> addIntoCollection(Sprint entity) {
		// TODO Auto-generated method stub
		super.add(entity);
		return super.toCollection();
	}
	
	@PUT @Path("/{id}")
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	@Override
	public Sprint add(Sprint sprint) {
		sprint=super.add(sprint);
		return sprint;
	}
	
	@DELETE
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public Collection<Sprint> removeFromCollection(Sprint entity) {
		// TODO Auto-generated method stub
		super.remove(entity);
		return super.toCollection();
	}
	
	@DELETE @Path("/{id}")
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public void remove(@PathParam("id")Integer id) {
		// TODO Auto-generated method stub
		Sprint sprint=super.getById(id);
		super.remove(sprint);
	}
	
	@GET
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Override
	public Collection<Sprint> toCollection() {
		// TODO Auto-generated method stub
		return super.toCollection();
	}
	
	@GET @Path("/{id}")
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Sprint getById(@PathParam("id") Integer id) {
		// TODO Auto-generated method stub
		Sprint sprint = super.getById(id);
		logger.info("***Debug REST getById ("+id+")="+sprint);
		return sprint;
	}
	
	@Override
	public Sprint refresh(Sprint entity) {
		// TODO Auto-generated method stub
		return super.refresh(entity);
	}
}
