package org.app.service.entities;

import java.awt.Color;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Label extends EntityBase{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8737084417586103526L;
	
	private String caption;
	private Color color;
	@ManyToOne
	private Board board;
	@OneToMany(mappedBy = "label")
	private List<WorkItemLabel> workItems;
	
	public Label() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Label(Integer id, Integer version, String createdByUser, String updatedByUser, Date dateCreated,
			Date dateUpdated, Boolean isDeleted) {
		super(id, version, createdByUser, updatedByUser, dateCreated, dateUpdated, isDeleted);
		// TODO Auto-generated constructor stub
	}
	public Label(Integer id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	public Label(String name, Color color, Board board, List<WorkItemLabel> workItems) {
		super();
		this.caption = name;
		this.color = color;
		this.board = board;
		this.workItems = workItems;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public Board getBoard() {
		return board;
	}
	public void setBoard(Board board) {
		this.board = board;
	}	
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public List<WorkItemLabel> getWorkItems() {
		return workItems;
	}
	public void setWorkItems(List<WorkItemLabel> workItems) {
		this.workItems = workItems;
	}
}
