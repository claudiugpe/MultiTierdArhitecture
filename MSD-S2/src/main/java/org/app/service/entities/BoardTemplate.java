package org.app.service.entities;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class BoardTemplate extends EntityBase{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5998805785067314233L;
	
	@OneToMany(mappedBy = "template")
	private List<Board> boards;
	
	@OneToMany()
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
	public BoardTemplate(List<Board> boards, List<BoardState> boardStates) {
		super();
		this.boards = boards;
		this.boardStates = boardStates;
	}
	public List<Board> getBoards() {
		return boards;
	}
	public void setBoards(List<Board> boards) {
		this.boards = boards;
	}
	public List<BoardState> getBoardStates() {
		return boardStates;
	}
	public void setBoardStates(List<BoardState> boardStates) {
		this.boardStates = boardStates;
	}
	
	
}
