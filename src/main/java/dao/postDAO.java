package dao;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.Post;
import model.User;

public class postDAO {
	private final String JDBC_URL = "jdbc:h2:tcp://localhost/~/example";
	private final String DB_USER = "sa";
	private final String DB_pass = "";

	public boolean doPost(Post post) {
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

	public List<Post> getNewPost() {
		List<Post> postList = new ArrayList<Post>();
		System.out.println("getNewPost呼び出し");
		try (Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_pass)) {
			String sql = "select CUSTOMER_ID,LARGE_ID,MIDDLE_ID,TITLE,TEXT,GOOD,POST_TIME,IMAGE FROM POST ORDER BY POST_TIME DESC LIMIT 6;";
			System.out.println(sql);
			PreparedStatement pStmt = conn.prepareStatement(sql);

			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {
				String id = rs.getString("customer_id");
				int large_id = rs.getInt("LARGE_ID");
				int middle_id = rs.getInt("middle_id");
				String title = rs.getString("TITLE");
				String text = rs.getString("TEXT");
				Timestamp post_time = rs.getTimestamp("POST_TIME");
				int good = rs.getInt("good");
				Blob image = rs.getBlob("image");
				Post post = new Post(id,large_id,middle_id,title,text,good,post_time,image);
				System.out.println("post: "+post);
				postList.add(post);

			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return postList;
	}

}
