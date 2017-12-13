package org.app.service.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="workItem")
@XmlAccessorType(XmlAccessType.NONE)
@Entity
public class WorkItem extends EntityBase{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1304678691271880734L;
	private String title;
	@ManyToOne
	private BoardState state;
	private String description;
	@ManyToOne
	private User user;
	@ManyToOne
	private WorkItemTemplate template; 
	@OneToMany
	private List<WorkItemLabel> labels;
	@OneToMany
	private List<Comment> comments;
	@ManyToOne
	private Sprint sprint;
	@OneToMany
	private List<WorkItemPropertyValue> workItemPropertyValues;
	@OneToMany(mappedBy = "workItem")
	private List<History> history;
	
	public WorkItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public List<WorkItemPropertyValue> getWorkItemPropertyValues() {
		return workItemPropertyValues;
	}
	public void setWorkItemPropertyValues(List<WorkItemPropertyValue> workItemPropertyValues) {
		this.workItemPropertyValues = workItemPropertyValues;
	}
	public WorkItem(String title, BoardState state, String description, User user, WorkItemTemplate template,
			List<WorkItemLabel> labels, List<Comment> comments, Sprint sprint,
			List<WorkItemPropertyValue> workItemPropertyValues) {
		super();
		this.title = title;
		this.state = state;
		this.description = description;
		this.user = user;
		this.template = template;
		this.labels = labels;
		this.comments = comments;
		this.sprint = sprint;
		this.workItemPropertyValues = workItemPropertyValues;
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
	@XmlElement
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@XmlElement
	public BoardState getState() {
		return state;
	}
	public void setState(BoardState state) {
		this.state = state;
	}
	@XmlElement
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@XmlElement
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@XmlElement
	public WorkItemTemplate getTemplate() {
		return template;
	}
	public void setTemplate(WorkItemTemplate template) {
		this.template = template;
	}
	
	@XmlElementWrapper(name="comments")
	@XmlElement(name="comment")
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	@XmlElement
	public Sprint getSprint() {
		return sprint;
	}
	public void setSprint(Sprint sprint) {
		this.sprint = sprint;
	}
	@XmlElementWrapper(name="histories")
	@XmlElement(name="history")
	public List<History> getHistory() {
		return history;
	}
}
