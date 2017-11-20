package org.app.service.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class WorkItemTemplate extends EntityBase{
	@OneToMany(mappedBy = "template")
	private List<WorkItem> workItems;

	public WorkItemTemplate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WorkItemTemplate(Integer id, Integer version, String createdByUser, String updatedByUser, Date dateCreated,
			Date dateUpdated, Boolean isDeleted) {
		super(id, version, createdByUser, updatedByUser, dateCreated, dateUpdated, isDeleted);
		// TODO Auto-generated constructor stub
	}

	public WorkItemTemplate(Integer id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	public WorkItemTemplate(List<WorkItem> workItems) {
		super();
		this.workItems = workItems;
	}

	public List<WorkItem> getWorkItems() {
		return workItems;
	}

	public void setWorkItems(List<WorkItem> workItems) {
		this.workItems = workItems;
	}
	
}
