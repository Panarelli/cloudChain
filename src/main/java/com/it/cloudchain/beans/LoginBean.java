package com.it.cloudchain.beans;

import java.io.Serializable;

import javax.swing.Spring;

public class LoginBean implements Serializable {

	private static final long serialVersionUID = -8546230976495049868L;
	private String username;
	private String password;
	
	public void prova(){
		System.out.println(Spring.class.getName());
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
