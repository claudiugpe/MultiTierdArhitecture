package org.app.service.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class LikedWorkItem extends EntityBase{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2139918679006422937L;
	
	@ManyToOne
	private WorkItem parent;
	@ManyToOne
	private WorkItem child;
	public LikedWorkItem(WorkItem parent, WorkItem child) {
		super();
		this.parent = parent;
		this.child = child;
	}
	public LikedWorkItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LikedWorkItem(Integer id, Integer version, String createdByUser, String updatedByUser, Date dateCreated,
			Date dateUpdated, Boolean isDeleted) {
		super(id, version, createdByUser, updatedByUser, dateCreated, dateUpdated, isDeleted);
		// TODO Auto-generated constructor stub
	}
	public LikedWorkItem(Integer id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	public WorkItem getParent() {
		return parent;
	}
	public void setParent(WorkItem parent) {
		this.parent = parent;
	}
	public WorkItem getChild() {
		return child;
	}
	public void setChild(WorkItem child) {
		this.child = child;
	}
}
