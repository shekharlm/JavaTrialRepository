package com.ag;

public class GITTestClass {
	private String username;
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
}
