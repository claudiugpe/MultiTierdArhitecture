package org.app.service.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="workitempropertyvalue")
@XmlAccessorType(XmlAccessType.NONE)
@Entity
public class WorkItemPropertyValue extends EntityBase {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5581159029058299692L;
	@ManyToOne
	private PropertyValue value;
	@ManyToOne
	private WorkItem workItem;
	public WorkItemPropertyValue(PropertyValue property, WorkItem workItem) {
		super();
		this.value = property;
		this.workItem = workItem;
	}
	public WorkItemPropertyValue() {
		super();
		// TODO Auto-generated constructor stub
	}
	@XmlElement
	public PropertyValue getWorkItemProperty() {
		return value;
	}
	public void setWorkItemProperty(PropertyValue workItemProperty) {
		this.value = workItemProperty;
	}
	@XmlElement
	public WorkItem getWorkItem() {
		return workItem;
	}
	public void setWorkItem(WorkItem workItem) {
		this.workItem = workItem;
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
