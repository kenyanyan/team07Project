package model;

import java.io.Serializable;

public class User implements Serializable {
	//User用のBeans
	String name;
	String pass;
	
	public User() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	public User(String name, String pass) {
		this.name = name;
		this.pass = pass;
		
	}
	public String getName() {return name;}
	public String getPass() {return pass;}
}
