package dao;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import model.User;

public class customerDAO {
	private final String JDBC_URL = "jdbc:h2:tcp://localhost/~/example";
	private final String DB_USER = "sa";
	private final String DB_pass = "";

	public List<User> findAll() {
		List<User> userList = new ArrayList<User>();
		try (Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_pass)) {
			String sql = "SELECT * from CUSTOMER";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			ResultSet rs = pStmt.executeQuery();

			while (rs.next()) {
				String id = rs.getString("customer_id");
				String name = rs.getString("name");
				String pass = rs.getString("pass");
				Date birthday = rs.getDate("date");
				String birthPlace = rs.getString("birthPlace");
				Blob icon = rs.getBlob("icon");
				User user = new User(id, pass, name, birthday, birthPlace, icon);
				userList.add(user);
			}

		} catch (Exception e) {
			return null;
		}
		return userList;
	}

	public User findUser(User user) {
		User DB_user;
		try (Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_pass)) {
			String sql = "SELECT * from CUSTOMER WHERE CUSTOMER_ID = '" + user.getid() + "'";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			ResultSet rs = pStmt.executeQuery();

			String id = rs.getString("customer_id");
			String name = rs.getString("name");
			String pass = rs.getString("pass");
			Date birthday = rs.getDate("date");
			String birthPlace = rs.getString("birthPlace");
			Blob icon = rs.getBlob("icon");
			DB_user = new User(id, pass, name, birthday, birthPlace, icon);

		} catch (Exception e) {
			return null;
		}
		return DB_user;
	}

	public String getPass(String id) {
		String pass = "";
		try (Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_pass)) {
			String sql = "SELECT pass from CUSTOMER WHERE customer_id='+id+'";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			ResultSet rs = pStmt.executeQuery();

			pass = rs.getString("pass");

		} catch (Exception e) {
			return null;
		}
		return pass;
	}

	public Boolean setUser(User user) {

		try (Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_pass)) {
			String sql = "INSERT INTO CUSTOMER ( CUSTOMER_ID , PASS , NAME ) VALUES('" + user.getid() + "','"
					+ user.getPass() + "','" + user.getname() + "');";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			ResultSet rs = pStmt.executeQuery();

		} catch (Exception e) {
			return false;
		}
		return true;

	}

	public Boolean updateUser(User user) {
		try (Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_pass)) {
			/*User tmpUser = findUser(user);
			String tmpSQL = "UPDATE CUSTOMER_ID SET ";
			if (user.getname().isBlank()) {
				tmpSQL = tmpSQL + "";
			}
			if (!(user.getPass().isBlank()) || tmpUser.getPass().equals(user.getPass())) {
			
			}
			if ( tmpUser.getBirthDay().equals(user.getBirthDay())) {
			
			}
			if(!(user.getBirthplace().isBlank()) || tmpUser.getBirthplace().equals(user.getBirthplace()))
			if ( tmpUser.getIcon().equals(user.getIcon())) {
				
			}
			String sql = tmpSQL + "WHERE customer_id ='" + user.getid() + "  ';";*/
			// User情報の更新　入力されているすべての値を変更
			String sql = "update customer set name = '"+user.getname()+"', PASS ='"+user.getPass()+"',birthDay ='"+user.getBirthDay()+"',birthplace ='"+user.getBirthplace()+"', ICON="+user.getIcon()+" WHERE CUSTOMER_ID ='kobe@test.co.jp';";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			ResultSet rs = pStmt.executeQuery();

		} catch (Exception e) {
			return false;
		}
		return true;
	}

}
