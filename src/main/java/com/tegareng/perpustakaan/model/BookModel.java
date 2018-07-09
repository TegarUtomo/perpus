package com.tegareng.perpustakaan.model;

import java.io.Serializable;

public class BookModel implements Serializable{
	
	private static final long serialVersionUID = -5822203757930531773L;
	private String id;
	private String name;
	private String desc;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}
