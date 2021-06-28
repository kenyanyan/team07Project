package model;

import java.io.Serializable;

public class User implements Serializable {
	private String address;
	private String pass;
	
	public User(String address,String pass) {
		setAddress(address);
		setPass(pass);
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
}
