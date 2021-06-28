package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.Post;

public class postDAO {
	private final String JDBC_URL = "jdbc:h2:tcp://localhost/~/example";
	private final String DB_USER = "sa";
	private final String DB_pass = "";

	public boolean doPost(Post post) {
		System.out.println("doPost呼出し");
		try (Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_pass)) {
			System.out.println("DB connect");
			String sql = "INSERT INTO POST (CUSTOMER_ID,LARGE_ID,MIDDLE_ID,TITLE,TEXT,IMAGE ) VALUES('"
					+ post.getCustomer_id() + "'," + post.getLarge_id() + "," + post.getMiddle_id() + ",'"
					+ post.getTitle() + "','" + post.getText() + "'," + post.getImage() + ");";
			System.out.println(sql);
			PreparedStatement pStmt = conn.prepareStatement(sql);

			pStmt.executeUpdate();

		} catch (Exception e) {
			return false;
		}
		return true;
	}

}
