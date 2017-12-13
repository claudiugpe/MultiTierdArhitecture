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

@XmlRootElement(name="user")
@XmlAccessorType(XmlAccessType.NONE)
@Entity
public class UserApp extends EntityBase {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8967510465337080017L;



	public UserApp(Integer id, Integer version, String createdByUser, String updatedByUser, Date dateCreated,
			Date dateUpdated, Boolean isDeleted) {
		super(id, version, createdByUser, updatedByUser, dateCreated, dateUpdated, isDeleted);
		// TODO Auto-generated constructor stub
	}
	
	public UserApp(String name, String password, List<UserClaim> userClaims) {
		super();
		Name = name;
		this.password = password;
		this.userClaims = userClaims;
	}

	private String Name;
	
	private String password;
	
	@OneToMany(mappedBy = "user")
	private List<UserClaim> userClaims;

	public UserApp() {
		super();
		// TODO Auto-generated constructor stub
	}



	public UserApp(Integer id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	@XmlElement
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	@XmlElement
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	@XmlElementWrapper(name="userclaims")
	@XmlElement(name="userclaim")
	public List<UserClaim> getUserClaims() {
		return userClaims;
	}

	public void setUserClaims(List<UserClaim> userClaims) {
		this.userClaims = userClaims;
	}


	
}
