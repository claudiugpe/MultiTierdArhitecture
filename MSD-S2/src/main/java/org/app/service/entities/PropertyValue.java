package org.app.service.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

@Entity
public class PropertyValue extends EntityBase {
	public PropertyValue() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PropertyValue(Integer id, Integer version, String createdByUser, String updatedByUser, Date dateCreated,
			Date dateUpdated, Boolean isDeleted) {
		super(id, version, createdByUser, updatedByUser, dateCreated, dateUpdated, isDeleted);
		// TODO Auto-generated constructor stub
	}
	public PropertyValue(Integer id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	@ManyToOne
	private WorkItemProperty property;
	private String value;
	public WorkItemProperty getProperty() {
		return property;
	}
	public void setProperty(WorkItemProperty property) {
		this.property = property;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public PropertyValue(WorkItemProperty property, String value) {
		super();
		this.property = property;
		this.value = value;
	}
}
