package org.xiongtou.model;

import java.io.Serializable;

public class Permission implements Serializable{
	
	private Integer id;
	private String descr;
	private String url;
	
	public Permission() {
	}
	
	public Permission(Integer id, String descr, String url) {
		super();
		this.id = id;
		this.descr = descr;
		this.url = url;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	

}
