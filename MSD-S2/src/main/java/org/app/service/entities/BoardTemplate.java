package org.app.service.entities;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class BoardTemplate extends EntityBase{
	
	@OneToOne()
	private Board board;
	
	@OneToMany
	private List<BoardState> boardStates;
	
	public BoardTemplate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BoardTemplate(Integer id, Integer version, String createdByUser, String updatedByUser, Date dateCreated,
			Date dateUpdated, Boolean isDeleted) {
		super(id, version, createdByUser, updatedByUser, dateCreated, dateUpdated, isDeleted);
		// TODO Auto-generated constructor stub
	}
	public BoardTemplate(Integer id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	public BoardTemplate(Board board, List<BoardState> boardStates) {
		super();
		this.board = board;
		this.boardStates = boardStates;
	}
	public Board getBoard() {
		return board;
	}
	public void setBoard(Board board) {
		this.board = board;
	}
	public List<BoardState> getBoardStates() {
		return boardStates;
	}
	public void setBoardStates(List<BoardState> boardStates) {
		this.boardStates = boardStates;
	}
	
	
}
