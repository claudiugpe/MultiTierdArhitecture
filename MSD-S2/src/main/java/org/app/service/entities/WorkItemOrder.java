package org.app.service.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="workitemorder")
@XmlAccessorType(XmlAccessType.NONE)
@Entity
public class WorkItemOrder extends EntityBase{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3062017076796190661L;
	
	@ManyToOne
	private WorkItem workItem;
	@ManyToOne
	private WorkItem completeAfterWorkItem;
	public WorkItemOrder() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WorkItemOrder(Integer id, Integer version, String createdByUser, String updatedByUser, Date dateCreated,
			Date dateUpdated, Boolean isDeleted) {
		super(id, version, createdByUser, updatedByUser, dateCreated, dateUpdated, isDeleted);
		// TODO Auto-generated constructor stub
	}
	public WorkItemOrder(Integer id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	@XmlElement
	public WorkItem getWorkItem() {
		return workItem;
	}
	public void setWorkItem(WorkItem workItem) {
		this.workItem = workItem;
	}
	@XmlElement
	public WorkItem getCompleteAfterWorkItem() {
		return completeAfterWorkItem;
	}
	public void setCompleteAfterWorkItem(WorkItem completeAfterWorkItem) {
		this.completeAfterWorkItem = completeAfterWorkItem;
	}
	public WorkItemOrder(WorkItem workItem, WorkItem completeAfterWorkItem) {
		super();
		this.workItem = workItem;
		this.completeAfterWorkItem = completeAfterWorkItem;
	}

	public static String BASE_URL = "http://localhost:8080/data/workitemorder/";

	@XmlElement(name = "link")
	public AtomLink getLink() throws Exception{
		String restUrl = BASE_URL + this.getId();
		
		return new AtomLink(restUrl, "get-workitemorder");
	}
	
}
