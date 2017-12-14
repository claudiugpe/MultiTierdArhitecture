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
@XmlRootElement(name="propertyValue")
@XmlAccessorType(XmlAccessType.NONE)
@Entity
public class PropertyValue extends EntityBase {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2784972318877952113L;
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
	@XmlElement
	public WorkItemProperty getProperty() {
		return property;
	}
	public void setProperty(WorkItemProperty property) {
		this.property = property;
	}
	@XmlElement
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

	public static String BASE_URL = "http://localhost:8080/data/propertyvalues/";

	@XmlElement(name = "link")
	public AtomLink getLink() throws Exception{
		String restUrl = BASE_URL + this.getId();
		
		return new AtomLink(restUrl, "get-propertyvalues");
	}
}
