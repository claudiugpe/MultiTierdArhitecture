package org.app.service.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="board")
@XmlAccessorType(XmlAccessType.NONE)
@Entity
public class Board extends EntityBase{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2434566723419755609L;
	private String title;
	@OneToMany()
	private List<Sprint> sprints = new ArrayList<Sprint>();
	@OneToMany()
	private List<BoardMember> members = new ArrayList<BoardMember>();
	@OneToOne
	private BoardTemplate template;
	@OneToMany()
	private List<Label> labels = new ArrayList<Label>();
	
	private Boolean isClosed;
	public Board() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Board(String title, List<Sprint> sprints, List<BoardMember> members, BoardTemplate template,
			List<Label> labels, Boolean isClosed) {
		super(null, null, null, null, new Date(), new Date(), false);
		this.title = title;
		this.sprints = sprints;
		this.members = members;
		this.template = template;
		this.labels = labels;
		this.isClosed = isClosed;
	}
	
	@XmlElement
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	//@XmlElementWrapper(name="sprints")
	//@XmlElement(name="sprint")
	public List<Sprint> getSprints() {
		return sprints;
	}
	public void setSprints(List<Sprint> sprints) {
		this.sprints = sprints;
	}
	
	//@XmlElementWrapper(name="members")
	//@XmlElement(name="member")
	public List<BoardMember> getMembers() {
		return members;
	}
	public void setMembers(List<BoardMember> members) {
		this.members = members;
	}
	
	//@XmlElement
	public BoardTemplate getTemplate() {
		return template;
	}
	public void setTemplate(BoardTemplate template) {
		this.template = template;
	}
	
	@XmlElement
	public Boolean getIsClosed() {
		return isClosed;
	}
	public void setIsClosed(Boolean isClosed) {
		this.isClosed = isClosed;
	}
	
	//@XmlElementWrapper(name="labels")
	//@XmlElement(name="label")
	public List<Label> getLabels() {
		return labels;
	}
	public void setLabels(List<Label> labels) {
		this.labels = labels;
	}
	
	public static String BASE_URL = "http://localhost:8080/data/boards/";

	@XmlElement(name = "link")
	public AtomLink getLink() throws Exception{
		String restUrl = BASE_URL + this.getId();
		
		return new AtomLink(restUrl, "get-board");
	}
}
