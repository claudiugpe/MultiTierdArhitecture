package org.app.service.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="history")
@XmlAccessorType(XmlAccessType.NONE)
@Entity
public class History extends EntityBase{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8747931848354314015L;
	
	public History(Date dateModified, String newValue, String oldValue, UserApp user, WorkItemPropertyValue property,
			WorkItem workItem) {
		super();
		this.dateModified = dateModified;
		this.newValue = newValue;
		this.oldValue = oldValue;
		this.user = user;
		this.property = property;
		this.workItem = workItem;
	}
	@XmlElement
	public Date getDateModified() {
		return dateModified;
	}
	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}
	@XmlElement
	public String getNewValue() {
		return newValue;
	}
	public void setNewValue(String newValue) {
		this.newValue = newValue;
	}
	@XmlElement
	public String getOldValue() {
		return oldValue;
	}
	public void setOldValue(String oldValue) {
		this.oldValue = oldValue;
	}
	@XmlElement(name="user")
	public UserApp getUser() {
		return user;
	}
	public void setUser(UserApp user) {
		this.user = user;
	}
	@XmlElement
	public WorkItemPropertyValue getProperty() {
		return property;
	}
	public void setProperty(WorkItemPropertyValue property) {
		this.property = property;
	}
	@XmlElement
	public WorkItem getWorkItem() {
		return workItem;
	}
	public void setWorkItem(WorkItem workItem) {
		this.workItem = workItem;
	}
	private Date dateModified;
	private String newValue;
	private String oldValue;
	@ManyToOne
	private UserApp user;
	@ManyToOne
	private WorkItemPropertyValue property;
	@ManyToOne
	private WorkItem workItem;
	public History() {
		super();
		// TODO Auto-generated constructor stub
	}
	public History(Integer id, Integer version, String createdByUser, String updatedByUser, Date dateCreated,
			Date dateUpdated, Boolean isDeleted) {
		super(id, version, createdByUser, updatedByUser, dateCreated, dateUpdated, isDeleted);
		// TODO Auto-generated constructor stub
	}
	public History(Integer id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	
	public static String BASE_URL = "http://localhost:8080/data/history/";

	@XmlElement(name = "link")
	public AtomLink getLink() throws Exception{
		String restUrl = BASE_URL + this.getId();
		
		return new AtomLink(restUrl, "get-history");
	}
}
