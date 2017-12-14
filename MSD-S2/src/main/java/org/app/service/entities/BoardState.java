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

@XmlRootElement(name="boardState")
@XmlAccessorType(XmlAccessType.NONE)
@Entity
public class BoardState extends EntityBase{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4779925834118990763L;
	private String caption;
	private String index;
	@ManyToOne
	private BoardTemplate boardTemplate;	
	
	public BoardState() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BoardState(Integer id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	@XmlElement
	public BoardTemplate getBoardTemplate() {
		return boardTemplate;
	}
	public void setBoardTemplate(BoardTemplate boardTemplate) {
		this.boardTemplate = boardTemplate;
	}
	public BoardState(String caption, String index, BoardTemplate boardTemplate) {
		super();
		this.caption = caption;
		this.index = index;
		this.boardTemplate = boardTemplate;
	}
	public BoardState(Integer id, Integer version, String createdByUser, String updatedByUser, Date dateCreated,
			Date dateUpdated, Boolean isDeleted) {
		super(id, version, createdByUser, updatedByUser, dateCreated, dateUpdated, isDeleted);
		// TODO Auto-generated constructor stub
	}
	public BoardState(String caption, String index) {
		super();
		this.caption = caption;
		this.index = index;
	}
	@XmlElement
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	@XmlElement
	public String getIndex() {
		return index;
	}
	public void setIndex(String index) {
		this.index = index;
	}

	public static String BASE_URL = "http://localhost:8080/data/boardstates/";

	@XmlElement(name = "link")
	public AtomLink getLink() throws Exception{
		String restUrl = BASE_URL + this.getId();
		
		return new AtomLink(restUrl, "get-boardstates");
	}
	
}
