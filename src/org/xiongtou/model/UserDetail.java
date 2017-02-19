package org.xiongtou.model;

import java.io.Serializable;
import java.util.Date;

public class UserDetail implements Serializable{
	
	private Integer user_id;
	private String username;
	private String password;
	private Date createDate;
	private Integer status;
	private Integer role_id;
	private String rolename;
	private Integer group_id;
	private String groupname;
	
	
	public UserDetail() {
	}
	
	public UserDetail(Integer user_id, String username, String password, Date createDate, Integer status,
			Integer role_id, String rolename, Integer group_id, String groupname) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.password = password;
		this.createDate = createDate;
		this.status = status;
		this.role_id = role_id;
		this.rolename = rolename;
		this.group_id = group_id;
		this.groupname = groupname;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getRole_id() {
		return role_id;
	}
	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}
	public String getRolename() {
		return rolename;
	}
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	public Integer getGroup_id() {
		return group_id;
	}
	public void setGroup_id(Integer group_id) {
		this.group_id = group_id;
	}
	public String getGroupname() {
		return groupname;
	}
	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}
	
	

}
