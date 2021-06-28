package model;

import java.io.Serializable;
import java.sql.Blob;
import java.util.Date;

public class User implements Serializable {
	private String id;
	private String pass;
	private String name;
	private Date Birthday;
	private String Birthplace;
	private Blob icon;

	public Blob getIcon() {
		return icon;
	}

	public void setIcon(Blob icon) {
		this.icon = icon;
	}

	public User(String id, String pass, String name) {
		setid(id);
		setPass(pass);
		setname(name);
	}

	public User(String id, String pass, String name, Date Birthday, String Birthplace, Blob icon) {
		setid(id);
		setPass(pass);
		setname(name);
		setBirthplace(Birthplace);
		setBirthDay(Birthday);
		setIcon(icon);
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public Date getBirthDay() {
		return Birthday;
	}

	public void setBirthDay(Date Birthday) {
		this.Birthday = Birthday;
	}

	public String getBirthplace() {
		return Birthplace;
	}

	public void setBirthplace(String birthplace) {
		Birthplace = birthplace;
	}

	public String getid() {
		return id;
	}

	public void setid(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
}
