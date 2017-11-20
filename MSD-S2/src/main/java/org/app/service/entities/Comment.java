package org.app.service.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Comment extends EntityBase {
	public Comment(String description, User user, WorkItem workItem) {
		super();
		this.description = description;
		this.user = user;
		this.workItem = workItem;
	}

	private String description;
	@ManyToOne
	private User user;
	@ManyToOne
	private WorkItem workItem;

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

	public WorkItem getWorkItem() {
		return workItem;
	}

	public void setWorkItem(WorkItem workItem) {
		this.workItem = workItem;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
