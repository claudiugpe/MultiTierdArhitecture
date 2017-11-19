package org.app.service.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class WorkItemLabel extends EntityBase{
	@ManyToOne
	private Label label;
	@ManyToOne
	private WorkItem workItem;
	public WorkItemLabel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WorkItemLabel(Integer id, Integer version, String createdByUser, String updatedByUser, Date dateCreated,
			Date dateUpdated, Boolean isDeleted) {
		super(id, version, createdByUser, updatedByUser, dateCreated, dateUpdated, isDeleted);
		// TODO Auto-generated constructor stub
	}
	public WorkItemLabel(Integer id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	public WorkItemLabel(Label label, WorkItem workItem) {
		super();
		this.label = label;
		this.workItem = workItem;
	}
	public Label getLabel() {
		return label;
	}
	public void setLabel(Label label) {
		this.label = label;
	}
	public WorkItem getWorkItem() {
		return workItem;
	}
	public void setWorkItem(WorkItem workItem) {
		this.workItem = workItem;
	}
	
	
}
