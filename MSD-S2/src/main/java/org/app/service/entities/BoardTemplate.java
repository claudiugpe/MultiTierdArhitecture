package org.app.service.entities;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="boardTemplate")
@XmlAccessorType(XmlAccessType.NONE)
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
	@XmlElementWrapper(name="boards")
	@XmlElement(name="board")
	public List<Board> getBoards() {
		return boards;
	}
	public void setBoards(List<Board> boards) {
		this.boards = boards;
	}
	@XmlElementWrapper(name="boardStates")
	@XmlElement(name="boardState")
	public List<BoardState> getBoardStates() {
		return boardStates;
	}
	public void setBoardStates(List<BoardState> boardStates) {
		this.boardStates = boardStates;
	}

	public static String BASE_URL = "http://localhost:8080/data/boardtemplates/";

	@XmlElement(name = "link")
	public AtomLink getLink() throws Exception{
		String restUrl = BASE_URL + this.getId();
		
		return new AtomLink(restUrl, "get-boardtemplates");
	}
	
}
