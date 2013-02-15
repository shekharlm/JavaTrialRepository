package com.ag;

public class GITTestClass {
	private String username,password;
	static{
		System.out.println("Class Loaded");
	}
	public GITTestClass() {
		System.out.println("Object Created");
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
