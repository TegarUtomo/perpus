package com.tegareng.perpustakaan.model;

import java.io.Serializable;

public class Response implements Serializable{

	private static final long serialVersionUID = 8977536718657428305L;
	
	private String code;
	private String message;
	
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
