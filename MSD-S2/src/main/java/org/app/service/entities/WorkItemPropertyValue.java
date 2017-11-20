package org.app.service.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class WorkItemPropertyValue extends EntityBase {
	@ManyToOne
	private WorkItemProperty workItemProperty;
	@ManyToOne
	private WorkItem workItem;
	private String value;
	public WorkItemPropertyValue(WorkItemProperty workItemProperty, WorkItem workItem, String value) {
		super();
		this.workItemProperty = workItemProperty;
		this.workItem = workItem;
		this.value = value;
	}
	public WorkItemPropertyValue() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WorkItemProperty getWorkItemProperty() {
		return workItemProperty;
	}
	public void setWorkItemProperty(WorkItemProperty workItemProperty) {
		this.workItemProperty = workItemProperty;
	}
	public WorkItem getWorkItem() {
		return workItem;
	}
	public void setWorkItem(WorkItem workItem) {
		this.workItem = workItem;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public WorkItemPropertyValue(Integer id, Integer version, String createdByUser, String updatedByUser,
			Date dateCreated, Date dateUpdated, Boolean isDeleted) {
		super(id, version, createdByUser, updatedByUser, dateCreated, dateUpdated, isDeleted);
		// TODO Auto-generated constructor stub
	}
	public WorkItemPropertyValue(Integer id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
}
