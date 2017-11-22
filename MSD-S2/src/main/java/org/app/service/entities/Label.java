package org.app.service.entities;

import java.awt.Color;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

@Entity
public class Label extends EntityBase{
	private String name;
	private Color color;
	@ManyToOne
	private Board board;
	
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
	public Label(String name, Color color, Board board) {
		super();
		this.name = name;
		this.color = color;
		this.board = board;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
}
