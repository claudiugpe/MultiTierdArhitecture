package org.app.service.entities;

import static javax.persistence.GenerationType.AUTO;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@MappedSuperclass
public abstract class EntityBase implements Serializable{
		/**
	 * 
	 */
	private static final long serialVersionUID = -2522363024346186231L;
		@Id
		@GeneratedValue(strategy = AUTO)
		protected Integer id;
		@Version
		protected Integer version;
		protected String createdByUser;
		protected String updatedByUser;
		@Temporal(value = TemporalType.TIMESTAMP)
		@Column(name = "dateCreated", nullable = false)
		protected Date dateCreated=Calendar.getInstance().getTime();

		@Temporal(value = TemporalType.TIMESTAMP)
		@Column(name = "dateUpdated", nullable = false)
		protected Date dateUpdated=Calendar.getInstance().getTime();

		private Boolean isDeleted=false;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public Boolean getIsDeleted() {
			return isDeleted;
		}
		public void setIsDeleted(Boolean isDeleted) {
			this.isDeleted = isDeleted;
		}
		public EntityBase() {
			super();
			// TODO Auto-generated constructor stub
		}
		public EntityBase(Integer id) {
			super();
			this.id = id;
		}
		public Integer getVersion() {
			return version;
		}
		public void setVersion(Integer version) {
			this.version = version;
		}
		public String getCreatedByUser() {
			return createdByUser;
		}
		public void setCreatedByUser(String createdByUser) {
			this.createdByUser = createdByUser;
		}
		public String getUpdatedByUser() {
			return updatedByUser;
		}
		public void setUpdatedByUser(String updatedByUser) {
			this.updatedByUser = updatedByUser;
		}
		public Date getDateCreated() {
			return dateCreated;
		}
		public void setDateCreated(Date dateCreated) {
			this.dateCreated = dateCreated;
		}
		public Date getDateUpdated() {
			return dateUpdated;
		}
		public void setDateUpdated(Date dateUpdated) {
			this.dateUpdated = dateUpdated;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			EntityBase other = (EntityBase) obj;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			return true;
		}
		public EntityBase(Integer id, Integer version, String createdByUser, String updatedByUser, Date dateCreated,
				Date dateUpdated, Boolean isDeleted) {
			super();
			this.id = id;
			this.version = version;
			this.createdByUser = createdByUser;
			this.updatedByUser = updatedByUser;
			this.dateCreated = dateCreated;
			this.dateUpdated = dateUpdated;
			this.isDeleted = isDeleted;
		}
}
