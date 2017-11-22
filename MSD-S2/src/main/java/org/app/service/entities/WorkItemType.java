package org.app.service.entities;

import java.awt.Color;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
public class WorkItemType extends EntityBase {
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
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
}
