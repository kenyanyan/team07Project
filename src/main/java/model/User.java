package model;

import java.io.Serializable;
import java.util.Date;

import javax.xml.crypto.Data;

public class User implements Serializable {
	private String address;
	private String pass;
	private String nickname;
	private Date Birthdate;
	private String sex;
	private String Birthplace;

	public User(String address, String pass) {
		setAddress(address);
		setPass(pass);
	}

	public User(String address, String pass, String nickname, Date Birthdate, String sex, String Birthplace) {
		setAddress(address);
		setPass(pass);
		setNickname(nickname);
		setBirthplace(Birthplace);
		setBirthDate(Birthdate);
		setSex(sex);
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Date getBirthDate() {
		return Birthdate;
	}

	public void setBirthDate(Date Birthdate) {
		this.Birthdate = Birthdate;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirthplace() {
		return Birthplace;
	}

	public void setBirthplace(String birthplace) {
		Birthplace = birthplace;
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
