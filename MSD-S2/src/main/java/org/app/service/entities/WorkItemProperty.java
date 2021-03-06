package org.app.service.entities;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="workitemproperty")
@XmlAccessorType(XmlAccessType.NONE)
@Entity
public class WorkItemProperty extends EntityBase{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2113342210944345680L;
	public WorkItemProperty(String caption, String propertyType, List<PropertyValue> propertyValues) {
		super();
		this.caption = caption;
		this.propertyType = propertyType;
		this.propertyValues = propertyValues;
	}
	private String caption;
	private String propertyType;
	@OneToMany() 
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
	@XmlElement
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	@XmlElement
	public String getPropertyType() {
		return propertyType;
	}
	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}
	@XmlElementWrapper(name="propertyvalues")
	@XmlElement(name="propertyvalue")
	public List<PropertyValue> getPropertyValues() {
		return propertyValues;
	}
	public void setPropertyValues(List<PropertyValue> propertyValues) {
		this.propertyValues = propertyValues;
	}

	public static String BASE_URL = "http://localhost:8080/data/wokritemproperties/";

	@XmlElement(name = "link")
	public AtomLink getLink() throws Exception{
		String restUrl = BASE_URL + this.getId();
		
		return new AtomLink(restUrl, "get-workitemproperty");
	}
}
