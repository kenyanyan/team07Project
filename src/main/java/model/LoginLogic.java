package model;

import java.sql.DriverManager;

import java.sql.Connection;

public class LoginLogic {
	private String DBurl = "";
	private String DBuser = "";
	private String DBpass = "";
	public boolean execute(User user) {
		try {
			Connection conn = DriverManager.getConnection(DBurl,DBuser,DBpass);
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
	
}

