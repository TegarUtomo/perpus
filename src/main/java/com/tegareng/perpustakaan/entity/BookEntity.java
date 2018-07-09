package com.tegareng.perpustakaan.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Max;

@Entity
public class BookEntity {
	
	@Id
	@Max(value=32)
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
