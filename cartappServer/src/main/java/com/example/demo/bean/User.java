package com.example.demo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;
	
	private String fullName;
	private String email;
	private String mobNo;
	private String address;
	private String userName;
	private String paswrd;
	//@OneToMany
	//private Order order;
	
	
	
	
	public User(String fullName, String email, String mobNo, String address, String userName, String paswrd) {
		super();
		this.fullName = fullName;
		this.email = email;
		this.mobNo = mobNo;
		this.address = address;
		this.userName = userName;
		this.paswrd = paswrd;
	}
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPaswrd() {
		return paswrd;
	}
	public void setPaswrd(String paswrd) {
		this.paswrd = paswrd;
	}
	

}
