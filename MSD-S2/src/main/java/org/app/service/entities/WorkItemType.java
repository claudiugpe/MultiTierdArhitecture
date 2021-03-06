package org.app.service.entities;

import java.awt.Color;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="workItemType")
@XmlAccessorType(XmlAccessType.NONE)
@Entity
public class WorkItemType extends EntityBase {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8214281714771346952L;
	public WorkItemType(String caption, Color color) {
		super();
		this.caption = caption;
		this.color = color;
	}
	public WorkItemType() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WorkItemType(Integer id, Integer version, String createdByUser, String updatedByUser, Date dateCreated,
			Date dateUpdated, Boolean isDeleted) {
		super(id, version, createdByUser, updatedByUser, dateCreated, dateUpdated, isDeleted);
		// TODO Auto-generated constructor stub
	}
	public WorkItemType(Integer id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	private String caption;
	private Color color;
	@XmlElement
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	@XmlElement
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	

	public static String BASE_URL = "http://localhost:8080/data/workitemtypes/";

	@XmlElement(name = "link")
	public AtomLink getLink() throws Exception{
		String restUrl = BASE_URL + this.getId();
		
		return new AtomLink(restUrl, "get-workitemtype");
	}
}
