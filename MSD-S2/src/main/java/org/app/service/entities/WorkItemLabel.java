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

@XmlRootElement(name="workitemlabel")
@XmlAccessorType(XmlAccessType.NONE)
@Entity
public class WorkItemLabel extends EntityBase{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2868170089607623518L;
	@ManyToOne
	private Label label;
	@ManyToOne
	private WorkItem workItem;
	
	public WorkItemLabel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WorkItemLabel(Integer id, Integer version, String createdByUser, String updatedByUser, Date dateCreated,
			Date dateUpdated, Boolean isDeleted) {
		super(id, version, createdByUser, updatedByUser, dateCreated, dateUpdated, isDeleted);
		// TODO Auto-generated constructor stub
	}
	public WorkItemLabel(Integer id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	public WorkItemLabel(Label label, WorkItem workItem) {
		super();
		this.label = label;
		this.workItem = workItem;
	}
	@XmlElement
	public Label getLabel() {
		return label;
	}
	public void setLabel(Label label) {
		this.label = label;
	}
	@XmlElement
	public WorkItem getWorkItem() {
		return workItem;
	}
	public void setWorkItem(WorkItem workItem) {
		this.workItem = workItem;
	}

	public static String BASE_URL = "http://localhost:8080/data/workitemlabels/";

	@XmlElement(name = "link")
	public AtomLink getLink() throws Exception{
		String restUrl = BASE_URL + this.getId();
		
		return new AtomLink(restUrl, "get-workitemlabel");
	}
	
}
