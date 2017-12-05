package org.app.service.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class WorkItemTemplate extends EntityBase{
	/**
	 * 
	 */
	private static final long serialVersionUID = 621241099648480182L;

	public WorkItemTemplate(List<WorkItem> workItems, List<WorkItemTemplateProperty> properties, WorkItemType workItemType) {
		super();
		this.workItems = workItems;
		this.properties = properties;
		this.workItemType = workItemType;
	}

	@OneToMany
	private List<WorkItem> workItems;
	@OneToMany
	private List<WorkItemTemplateProperty> properties;
	@ManyToOne
	private WorkItemType workItemType;

	public List<WorkItemTemplateProperty> getProperties() {
		return properties;
	}

	public void setProperties(List<WorkItemTemplateProperty> properties) {
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
