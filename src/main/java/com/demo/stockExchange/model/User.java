package com.demo.stockExchange.model;

public class User {
	
	private int userId;
	private String userName;
	private String password;
	private String userType;
	private String email;
	private long mobileno;
	private boolean confirmed;
	public User(String userName, String password, String userType, String email, long mobileno, boolean confirmed) {
		super();
		this.userName = userName;
		this.password = password;
		this.userType = userType;
		this.email = email;
		this.mobileno = mobileno;
		this.confirmed = confirmed;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public boolean isConfirmed() {
		return confirmed;
	}
	public void setConfirmed(boolean confirmed) {
		this.confirmed = confirmed;
	}
	
}
