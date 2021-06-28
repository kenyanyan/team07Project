package model;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;

public class LoginLogic {
	private String DBurl = "";
	private String DBuser = "";
	private String DBpass = "";
	public boolean execute(User user) {
		try {
			//DAOにアクセスしてユーザIDとパスワード比較の処理追加
			if(true == true ) { // 一致の比較
				return true;
			}else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
		
	}
}

