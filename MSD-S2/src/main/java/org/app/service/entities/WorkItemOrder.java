package org.app.service.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

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
	public WorkItem getWorkItem() {
		return workItem;
	}
	public void setWorkItem(WorkItem workItem) {
		this.workItem = workItem;
	}
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
}
