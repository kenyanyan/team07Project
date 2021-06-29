package model;

import java.sql.Blob;
import java.sql.Timestamp;
import java.util.Date;

public class Post {
	private int post_id;
	private String customer_id;
	private int large_id;
	private int middle_id;
	private String title;
	private String text;
	private int good;
	private Timestamp  post_time;
	private Blob image;
	
	
	public Post(String customer_id,int large_id,int middle_id,String title,String text,Blob image) {
		setCustomer_id(customer_id);
		setLarge_id(large_id);
		setMiddle_id(middle_id);
		setTitle(title);
		setText(text);
		setImage(image);
	}
	public Post(String customer_id,int large_id,int middle_id,String title,String text,int good,Timestamp  post_time,Blob image) {
		setCustomer_id(customer_id);
		setLarge_id(large_id);
		setMiddle_id(middle_id);
		setTitle(title);
		setText(text);
		setPost_time(post_time);
		setImage(image);
		setGood(good);
	}
	
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_id() {
		return this.customer_id;
	}

	public int getPost_id() {
		return post_id;
	}
	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}
	public int getLarge_id() {
		return large_id;
	}
	public void setLarge_id(int large_id) {
		this.large_id = large_id;
	}
	public int getMiddle_id() {
		return middle_id;
	}
	public void setMiddle_id(int middle_id) {
		this.middle_id = middle_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getGood() {
		return good;
	}
	public void setGood(int good) {
		this.good = good;
	}
	public Timestamp  getPost_time() {
		return post_time;
	}
	public void setPost_time(Timestamp  post_time) {
		this.post_time = post_time;
	}
	public Blob getImage() {
		return image;
	}
	public void setImage(Blob image) {
		this.image = image;
	}
}
