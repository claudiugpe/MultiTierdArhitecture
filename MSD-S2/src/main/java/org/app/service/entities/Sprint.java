package org.app.service.entities;

import java.util.List;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Sprint extends EntityBase{
	private Boolean isCanceled;
	private String title;
	private String description;
	private Date startDate;
	private Date endDate;
	@ManyToOne
	private Board board;
	@OneToMany()
	private List<WorkItem> workItems;
	
	
	public Sprint() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sprint(Integer id, Integer version, String createdByUser, String updatedByUser, Date dateCreated,
			Date dateUpdated, Boolean isDeleted) {
		super(id, version, createdByUser, updatedByUser, dateCreated, dateUpdated, isDeleted);
		// TODO Auto-generated constructor stub
	}
	
	public Sprint(Boolean isCanceled, String title, String description, Date startDate, Date endDate, Board board,
			List<WorkItem> workItems) {
		super();
		this.isCanceled = isCanceled;
		this.title = title;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.board = board;
		this.workItems = workItems;
	}
	
	public Sprint(Boolean isCanceled, String title, String description, Date startDate, Date endDate, Board board) {
		super();
		this.isCanceled = isCanceled;
		this.title = title;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.board = board;
	}
	
	public Sprint(Integer id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	public Boolean getIsCanceled() {
		return isCanceled;
	}
	public void setIsCanceled(Boolean isCanceled) {
		this.isCanceled = isCanceled;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Board getBoard() {
		return board;
	}
	public void setBoard(Board board) {
		this.board = board;
	}
	public List<WorkItem> getWorkItems() {
		return workItems;
	}
	public void setWorkItems(List<WorkItem> workItems) {
		this.workItems = workItems;
	}
	
	
	
}
