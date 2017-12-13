package org.app.service.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="workItemTemplate")
@XmlAccessorType(XmlAccessType.NONE)
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

	@XmlElementWrapper(name="workItemProperties")
	@XmlElement(name="workItemProperty")
	public List<WorkItemTemplateProperty> getProperties() {
		return properties;
	}

	public void setProperties(List<WorkItemTemplateProperty> properties) {
		this.properties = properties;
	}
	@XmlElement
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
	@XmlElementWrapper(name="workItems")
	@XmlElement(name="workItem")
	public List<WorkItem> getWorkItems() {
		return workItems;
	}

	public void setWorkItems(List<WorkItem> workItems) {
		this.workItems = workItems;
	}
	
}
