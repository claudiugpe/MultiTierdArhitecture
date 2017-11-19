package org.app.service.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class WorkItem extends EntityBase{
	private String title;
	@ManyToOne
	private BoardState state;
	private String description;
	private User user;
	private WorkItemTemplate template; 
	@OneToMany(mappedBy = "workItem")
	private List<WorkItemLabel> labels;
	private List<Comment> comments;
	@ManyToOne
	private Sprint sprint;
	public WorkItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WorkItem(Integer id, Integer version, String createdByUser, String updatedByUser, Date dateCreated,
			Date dateUpdated, Boolean isDeleted) {
		super(id, version, createdByUser, updatedByUser, dateCreated, dateUpdated, isDeleted);
		// TODO Auto-generated constructor stub
	}
	public WorkItem(Integer id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	
	
	public List<WorkItemLabel> getLabels() {
		return labels;
	}
	public void setLabels(List<WorkItemLabel> labels) {
		this.labels = labels;
	}
	
	public WorkItem(String title, BoardState state, String description, User user, WorkItemTemplate template,
			List<WorkItemLabel> labels, List<Comment> comments, Sprint sprint) {
		super();
		this.title = title;
		this.state = state;
		this.description = description;
		this.user = user;
		this.template = template;
		this.labels = labels;
		this.comments = comments;
		this.sprint = sprint;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public BoardState getState() {
		return state;
	}
	public void setState(BoardState state) {
		this.state = state;
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
	public WorkItemTemplate getTemplate() {
		return template;
	}
	public void setTemplate(WorkItemTemplate template) {
		this.template = template;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	public Sprint getSprint() {
		return sprint;
	}
	public void setSprint(Sprint sprint) {
		this.sprint = sprint;
	}
}
