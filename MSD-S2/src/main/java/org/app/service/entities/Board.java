package org.app.service.entities;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Board extends EntityBase{
	private String title;
	@OneToMany()
	private List<Sprint> sprints;
	@OneToMany()
	private List<BoardMember> members;
	@OneToOne
	private BoardTemplate template;
	@OneToMany()
	private List<Label> labels;
	
	private Boolean isClosed;
	public Board() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Board(Integer id, Integer version, String createdByUser, String updatedByUser, Date dateCreated,
			Date dateUpdated, Boolean isDeleted) {
		super(id, version, createdByUser, updatedByUser, dateCreated, dateUpdated, isDeleted);
		// TODO Auto-generated constructor stub
	}
	public Board(Integer id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	
	public Board(String title, List<Sprint> sprints, List<BoardMember> members, BoardTemplate template,
			List<Label> labels, Boolean isClosed) {
		super();
		this.title = title;
		this.sprints = sprints;
		this.members = members;
		this.template = template;
		this.labels = labels;
		this.isClosed = isClosed;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Sprint> getSprints() {
		return sprints;
	}
	public void setSprints(List<Sprint> sprints) {
		this.sprints = sprints;
	}
	public List<BoardMember> getMembers() {
		return members;
	}
	public void setMembers(List<BoardMember> members) {
		this.members = members;
	}
	public BoardTemplate getTemplate() {
		return template;
	}
	public void setTemplate(BoardTemplate template) {
		this.template = template;
	}
	public Boolean getIsClosed() {
		return isClosed;
	}
	public void setIsClosed(Boolean isClosed) {
		this.isClosed = isClosed;
	}
	public List<Label> getLabels() {
		return labels;
	}
	public void setLabels(List<Label> labels) {
		this.labels = labels;
	}
	
}
