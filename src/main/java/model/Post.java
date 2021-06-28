package model;

import java.sql.Blob;
import java.util.Date;

public class Post {
	private int post_id;
	private int customer_id;
	private int large_id;
	private int middle_id;
	private String title;
	private String text;
	private int good;
	private Date post_time;
	private Blob image;
	
	
	public Post(int customer_id,int large_id,int middle_id,String title,String text,int good,Date post_time,Blob image) {
		setCustomer_id(customer_id);
		setLarge_id(large_id);
		setMiddle_id(middle_id);
		setTitle(title);
		setText(text);
		setPost_time(post_time);
		setImage(image);
	}
	
	
	public int getPost_id() {
		return post_id;
	}
	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
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
	public Date getPost_time() {
		return post_time;
	}
	public void setPost_time(Date post_time) {
		this.post_time = post_time;
	}
	public Blob getImage() {
		return image;
	}
	public void setImage(Blob image) {
		this.image = image;
	}
}
