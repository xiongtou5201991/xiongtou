package org.xiongtou.model;

import java.io.Serializable;

public class RolePermission implements Serializable{
	
	private Integer role_id;
	private Integer permission_id;
	
	public RolePermission() {
	}
	
	public RolePermission(Integer role_id, Integer permission_id) {
		super();
		this.role_id = role_id;
		this.permission_id = permission_id;
	}
	
	
	public Integer getRole_id() {
		return role_id;
	}
	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}
	public Integer getPermission_id() {
		return permission_id;
	}
	public void setPermission_id(Integer permission_id) {
		this.permission_id = permission_id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((permission_id == null) ? 0 : permission_id.hashCode());
		result = prime * result + ((role_id == null) ? 0 : role_id.hashCode());
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
		RolePermission other = (RolePermission) obj;
		if (permission_id == null) {
			if (other.permission_id != null)
				return false;
		} else if (!permission_id.equals(other.permission_id))
			return false;
		if (role_id == null) {
			if (other.role_id != null)
				return false;
		} else if (!role_id.equals(other.role_id))
			return false;
		return true;
	}
	
	

}
