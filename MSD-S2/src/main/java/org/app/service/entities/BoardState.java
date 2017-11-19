package org.app.service.entities;

import javax.persistence.Entity;

@Entity
public class BoardState extends EntityBase{
	private String caption;
	private String index;
	
	public BoardState() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BoardState(Integer id) {
		super(id);
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
