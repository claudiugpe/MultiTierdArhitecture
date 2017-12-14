package org.app.service.entities;

import java.util.List;
import java.util.Date;
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
@XmlRootElement(name="sprint")
@XmlAccessorType(XmlAccessType.NONE)
@Entity
public class Sprint extends EntityBase{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4727711581711821573L;
	
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
	@XmlElement
	public Boolean getIsCanceled() {
		return isCanceled;
	}
	public void setIsCanceled(Boolean isCanceled) {
		this.isCanceled = isCanceled;
	}
	@XmlElement
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@XmlElement
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@XmlElement
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	@XmlElement
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	@XmlElement
	public Board getBoard() {
		return board;
	}
	public void setBoard(Board board) {
		this.board = board;
	}
	@XmlElementWrapper(name="workitems")
	@XmlElement(name="workitem")
	public List<WorkItem> getWorkItems() {
		return workItems;
	}
	public void setWorkItems(List<WorkItem> workItems) {
		this.workItems = workItems;
	}
	

	public static String BASE_URL = "http://localhost:8080/data/sprints/";

	@XmlElement(name = "link")
	public AtomLink getLink() throws Exception{
		String restUrl = BASE_URL + this.getId();
		
		return new AtomLink(restUrl, "get-sprint");
	}
	
}
