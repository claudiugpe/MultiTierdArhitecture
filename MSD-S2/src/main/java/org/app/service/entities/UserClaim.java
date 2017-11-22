package org.app.service.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class UserClaim extends EntityBase {
	@ManyToOne
	private User user;
	@OneToOne
	private Claim claim;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Claim getClaim() {
		return claim;
	}
	public void setClaim(Claim claim) {
		this.claim = claim;
	}
	public UserClaim(User user, Claim claim) {
		super();
		this.user = user;
		this.claim = claim;
	}
	public UserClaim() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserClaim(Integer id, Integer version, String createdByUser, String updatedByUser, Date dateCreated,
			Date dateUpdated, Boolean isDeleted) {
		super(id, version, createdByUser, updatedByUser, dateCreated, dateUpdated, isDeleted);
		// TODO Auto-generated constructor stub
	}
	public UserClaim(Integer id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
}
