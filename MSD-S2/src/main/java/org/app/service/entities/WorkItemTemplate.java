package org.app.service.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class WorkItemTemplate extends EntityBase{
	public WorkItemTemplate(List<WorkItem> workItems, List<WorkItemProperty> properties, WorkItemType workItemType) {
		super();
		this.workItems = workItems;
		this.properties = properties;
		this.workItemType = workItemType;
	}

	@OneToMany(mappedBy = "template")
	private List<WorkItem> workItems;
	@OneToMany
	private List<WorkItemProperty> properties;
	@ManyToOne
	private WorkItemType workItemType;

	public List<WorkItemProperty> getProperties() {
		return properties;
	}

	public void setProperties(List<WorkItemProperty> properties) {
		this.properties = properties;
	}

	public WorkItemType getWorkItemType() {
		return workItemType;
	}

	public void setWorkItemType(WorkItemType workItemType) {
		this.workItemType = workItemType;
	}

	public WorkItemTemplate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WorkItemTemplate(Integer id, Integer version, String createdByUser, String updatedByUser, Date dateCreated,
			Date dateUpdated, Boolean isDeleted) {
		super(id, version, createdByUser, updatedByUser, dateCreated, dateUpdated, isDeleted);
		// TODO Auto-generated constructor stub
	}

	public WorkItemTemplate(Integer id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	public WorkItemTemplate(List<WorkItem> workItems) {
		super();
		this.workItems = workItems;
	}

	public List<WorkItem> getWorkItems() {
		return workItems;
	}

	public void setWorkItems(List<WorkItem> workItems) {
		this.workItems = workItems;
	}
	
}
