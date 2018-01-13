package org.app.service.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name="user")
@XmlAccessorType(XmlAccessType.NONE)
@Entity
public class UserApp extends EntityBase {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8967510465337080017L;



	public UserApp(Integer id, Integer version, String createdByUser, String updatedByUser, Date dateCreated,
			Date dateUpdated, String name, String password,Boolean isDeleted) {
		super(id, version, createdByUser, updatedByUser, dateCreated, dateUpdated, isDeleted);
		// TODO Auto-generated constructor stub
		this.name=name;
		this.password=password;
	}

	private String name;
	
	private String password;
	
	@OneToMany(mappedBy = "user")
	private List<UserClaim> userClaims;

	public UserApp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserApp(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	public UserApp(Integer id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	
	@XmlElement
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@XmlElement
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	//@XmlElementWrapper(name="userclaims")
	//@XmlElement(name="userclaim")
	public List<UserClaim> getUserClaims() {
		return userClaims;
	}

	public void setUserClaims(List<UserClaim> userClaims) {
		this.userClaims = userClaims;
	}


	public static String BASE_URL = "http://localhost:8080/data/users/";

	@XmlTransient
	public AtomLink getLink() throws Exception{
		String restUrl = BASE_URL + this.getId();
		
		return new AtomLink(restUrl, "get-user");
	}
	
}
