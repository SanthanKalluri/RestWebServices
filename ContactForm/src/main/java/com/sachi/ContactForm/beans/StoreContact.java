package com.sachi.ContactForm.beans;

public class StoreContact {
	
	private String statusMessage;
	private int statusCode;
	public String getStatusMessage() {
		return statusMessage;
	}
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public StoreContact() {
		super();
		this.statusMessage = "Success";
		this.statusCode = 0;
	}
	

}
