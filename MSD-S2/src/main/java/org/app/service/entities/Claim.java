package org.app.service.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="claim")
@XmlAccessorType(XmlAccessType.NONE)
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
	@XmlElement(name="userClaim")
	public UserClaim getUserClaim() {
		return userClaim;
	}

	public void setUserClaim(UserClaim userClaim) {
		this.userClaim = userClaim;
	}
	@XmlElement
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	public static String BASE_URL = "http://localhost:8080/data/claims/";

	@XmlElement(name = "link")
	public AtomLink getLink() throws Exception{
		String restUrl = BASE_URL + this.getId();
		
		return new AtomLink(restUrl, "get-claims");
	}
}
