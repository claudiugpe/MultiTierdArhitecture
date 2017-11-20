package org.app.service.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class BoardMember extends EntityBase{
	
	@ManyToOne
	private User user;
	@ManyToOne
	private Board board;
	
	public BoardMember() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BoardMember(Integer id, Integer version, String createdByUser, String updatedByUser, Date dateCreated,
			Date dateUpdated, Boolean isDeleted) {
		super(id, version, createdByUser, updatedByUser, dateCreated, dateUpdated, isDeleted);
		// TODO Auto-generated constructor stub
	}
	public BoardMember(Integer id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	public BoardMember(User user, Board board) {
		super();
		this.user = user;
		this.board = board;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Board getBoard() {
		return board;
	}
	public void setBoard(Board board) {
		this.board = board;
	}
	
	
}
