package org.app.service.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class User extends EntityBase {
	public User(String name, String password, List<UserClaim> userClaims) {
		super();
		Name = name;
		this.password = password;
		this.userClaims = userClaims;
	}

	private String Name;
	
	private String password;
	
	@OneToMany(mappedBy = "user")
	private List<UserClaim> userClaims;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer id, Integer version, String createdByUser, String updatedByUser, Date dateCreated,
			Date dateUpdated, Boolean isDeleted) {
		super(id, version, createdByUser, updatedByUser, dateCreated, dateUpdated, isDeleted);
		// TODO Auto-generated constructor stub
	}

	public User(Integer id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<UserClaim> getUserClaims() {
		return userClaims;
	}

	public void setUserClaims(List<UserClaim> userClaims) {
		this.userClaims = userClaims;
	}
}
