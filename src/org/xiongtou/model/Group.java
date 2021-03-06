package org.xiongtou.model;

import java.io.Serializable;

public class Group implements Serializable{
	
	private Integer id;
	private String groupname;
	private String descr;
	
	public Group() {
	}
	
	public Group(Integer id, String groupname, String descr) {
		super();
		this.id = id;
		this.groupname = groupname;
		this.descr = descr;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGroupname() {
		return groupname;
	}
	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	
}
