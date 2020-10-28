package com.basic.auth;

public class AuthBean {
	
	private String message;

	public AuthBean(String message) {
		super();
		this.message = message;
	}
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "AuthBean [message=" + message + "]";
	}

}
