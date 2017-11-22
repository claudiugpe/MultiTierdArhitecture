package org.app.service.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

@Entity
public class BoardState extends EntityBase{
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
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public String getIndex() {
		return index;
	}
	public void setIndex(String index) {
		this.index = index;
	}
	
	
}
