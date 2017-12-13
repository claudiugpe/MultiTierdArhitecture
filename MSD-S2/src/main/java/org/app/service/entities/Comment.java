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
@XmlRootElement(name="comment")
@XmlAccessorType(XmlAccessType.NONE)
@Entity
public class Comment extends EntityBase {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1275628858408003946L;

	public Comment(String description, UserApp user, WorkItem workItem) {
		super();
		this.description = description;
		this.user = user;
		this.workItem = workItem;
		this.date = new Date();
	}

	private String description;
	@ManyToOne
	private UserApp user;
	@ManyToOne
	private WorkItem workItem;
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	private Date date;

	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Comment(Integer id, Integer version, String createdByUser, String updatedByUser, Date dateCreated,
			Date dateUpdated, Boolean isDeleted) {
		super(id, version, createdByUser, updatedByUser, dateCreated, dateUpdated, isDeleted);
		// TODO Auto-generated constructor stub
	}

	public Comment(Integer id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	public Comment(WorkItem workItem) {
		super();
		this.workItem = workItem;
	}
	@XmlElement(name="workItem")
	public WorkItem getWorkItem() {
		return workItem;
	}

	public void setWorkItem(WorkItem workItem) {
		this.workItem = workItem;
	}
	@XmlElement
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	@XmlElement(name="user")
	public UserApp getUser() {
		return user;
	}

	public void setUser(UserApp user) {
		this.user = user;
	}
	
}
