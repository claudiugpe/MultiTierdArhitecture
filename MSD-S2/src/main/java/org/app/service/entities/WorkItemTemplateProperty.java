package org.app.service.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="workItemTemplateProperty")
@XmlAccessorType(XmlAccessType.NONE)
@Entity
public class WorkItemTemplateProperty extends EntityBase{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5169391694527820372L;
	
	@ManyToOne
	private WorkItemTemplate template;
	@ManyToOne
	private WorkItemProperty property;
	public WorkItemTemplateProperty() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WorkItemTemplateProperty(Integer id, Integer version, String createdByUser, String updatedByUser,
			Date dateCreated, Date dateUpdated, Boolean isDeleted) {
		super(id, version, createdByUser, updatedByUser, dateCreated, dateUpdated, isDeleted);
		// TODO Auto-generated constructor stub
	}
	public WorkItemTemplateProperty(WorkItemTemplate template, WorkItemProperty property) {
		super();
		this.template = template;
		this.property = property;
	}
	@XmlElement
	public WorkItemTemplate getTemplate() {
		return template;
	}
	public void setTemplate(WorkItemTemplate template) {
		this.template = template;
	}
	@XmlElement
	public WorkItemProperty getProperty() {
		return property;
	}
	public void setProperty(WorkItemProperty property) {
		this.property = property;
	}
	public WorkItemTemplateProperty(Integer id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
}
