package org.app.service.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="userclaim")
@XmlAccessorType(XmlAccessType.NONE)
@Entity
public class UserClaim extends EntityBase {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5980642949650894766L;
	@ManyToOne
	private UserApp user;
	@OneToOne
	private Claim claim;
	@XmlElement
	public UserApp getUser() {
		return user;
	}
	public void setUser(UserApp user) {
		this.user = user;
	}
	@XmlElement
	public Claim getClaim() {
		return claim;
	}
	public void setClaim(Claim claim) {
		this.claim = claim;
	}
	public UserClaim(UserApp user, Claim claim) {
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
	
	public static String BASE_URL = "http://localhost:8080/data/userclaims/";

	@XmlElement(name = "link")
	public AtomLink getLink() throws Exception{
		String restUrl = BASE_URL + this.getId();
		
		return new AtomLink(restUrl, "get-userclaim");
	}
}
