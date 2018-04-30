package com.sachi.ContactForm.beans;

public class Contact {
	private String name;
	private String address;
	private String phone;
	private String information;

	public Contact(String name, String address, String phone, String information) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.information = information;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", address=" + address + ", phone=" + phone + ", information=" + information
				+ "]";
	}

}
