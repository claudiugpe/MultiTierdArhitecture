package org.app.service.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;

@Entity
public class Claim extends EntityBase {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8642228410711167734L;

	@OneToOne
	private UserClaim userClaim;
	
	private String description;

	public Claim(UserClaim userClaim, String description) {
		super();
		this.userClaim = userClaim;
		this.description = description;
	}

	public Claim() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Claim(Integer id, Integer version, String createdByUser, String updatedByUser, Date dateCreated,
			Date dateUpdated, Boolean isDeleted) {
		super(id, version, createdByUser, updatedByUser, dateCreated, dateUpdated, isDeleted);
		// TODO Auto-generated constructor stub
	}

	public Claim(Integer id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	public UserClaim getUserClaim() {
		return userClaim;
	}

	public void setUserClaim(UserClaim userClaim) {
		this.userClaim = userClaim;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
