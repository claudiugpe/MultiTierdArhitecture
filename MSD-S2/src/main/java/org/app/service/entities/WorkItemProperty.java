package org.app.service.entities;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class WorkItemProperty extends EntityBase{
	public WorkItemProperty(String caption, String propertyType, List<PropertyValue> propertyValues) {
		super();
		this.caption = caption;
		this.propertyType = propertyType;
		this.propertyValues = propertyValues;
	}
	private String caption;
	private String propertyType;
	@OneToMany(mappedBy = "property")
	private List<PropertyValue> propertyValues;
	public WorkItemProperty() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WorkItemProperty(Integer id, Integer version, String createdByUser, String updatedByUser, Date dateCreated,
			Date dateUpdated, Boolean isDeleted) {
		super(id, version, createdByUser, updatedByUser, dateCreated, dateUpdated, isDeleted);
		// TODO Auto-generated constructor stub
	}
	public WorkItemProperty(Integer id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public String getPropertyType() {
		return propertyType;
	}
	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}
	public List<PropertyValue> getPropertyValues() {
		return propertyValues;
	}
	public void setPropertyValues(List<PropertyValue> propertyValues) {
		this.propertyValues = propertyValues;
	}
}
