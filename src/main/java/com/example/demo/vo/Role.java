package com.example.demo.vo;

import java.io.Serializable;

public class Role implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String id;
	
	private String rname;
	
	private String parentId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}
	
	

}
