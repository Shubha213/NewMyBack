package com.basics.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Blog")
public class Blog {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "blog_id")
	private int blogId;   //primary key
	@Column(name = "user_id")
	private int userId;
	@Column(length = 1000)
	private String blog_title;
	@Column(length = 10000000)
	private String blog_text;
	private String tags;
	private int views;
	private int likes;
    @Column(name = "company")
	private String company;
	
	public int getBlog_id() {
		return blogId;
	}
	public void setBlog_id(int blog_id) {
		this.blogId = blog_id;
	}
	public int getUser_id() {
		return userId;
	}
	public void setUser_id(int user_id) {
		this.userId = user_id;
	}
	public String getBlog_title() {
		return blog_title;
	}
	public void setBlog_title(String blog_title) {
		this.blog_title = blog_title;
	}
	public String getBlog_text() {
		return blog_text;
	}
	public void setBlog_text(String blog_text) {
		this.blog_text = blog_text;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	public Blog(int blog_id, int user_id, String blog_title, String blog_text, String tags, int views, int likes, String company) {
		super();
		this.blogId = blog_id;
		this.userId = user_id;
		this.blog_title = blog_title;
		this.blog_text = blog_text;
		this.tags = tags;
		this.views = views;
		this.likes = likes;
		this.company = company;
	}
	
	Blog(){
		
	}
	
}
