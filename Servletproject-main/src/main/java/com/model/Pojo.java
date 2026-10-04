package com.model;

public class Pojo {

	private String Fullname;
	private String ReferCode;
	private String mail;
	private String Phone;
	private String pass;
	private String id;
	
	
	//order table
	private String Plantname;
	private String price;
	private String address;
	
	

	
	
	
	

	public String getPlantname() {
		return Plantname;
	}

	public void setPlantname(String plantname) {
		Plantname = plantname;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {

		return "Pojo [Fullname=" + Fullname + ", ReferCode=" + ReferCode + ", mail=" + mail + ", Phone=" + Phone
				+ ", pass=" + pass + "]";
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id=id;
	}

	

	public String getFullname() {
		return Fullname;
	}

	public void setFullname(String fullname) {
		Fullname = fullname;
	}

	public String getReferCode() {
		return ReferCode;
	}

	public void setReferCode(String referCode) {
		ReferCode = referCode;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
	
}