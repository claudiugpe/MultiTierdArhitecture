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

@XmlRootElement(name="boardMember")
@XmlAccessorType(XmlAccessType.NONE)
@Entity
public class BoardMember extends EntityBase{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2500384259600959349L;
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
	@XmlElement
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@XmlElement
	public Board getBoard() {
		return board;
	}
	public void setBoard(Board board) {
		this.board = board;
	}
	
	
}
