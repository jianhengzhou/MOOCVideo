package com.scut.jianheng.module;

public class Comment {
	private int id;
	private int user_id;
	private String comment;
	private int loves;
	
	
	public int getId() {
		return id;
	}
	public int getUser_id() {
		return user_id;
	}
	public String getComment() {
		return comment;
	}
	public int getLoves() {
		return loves;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public void setLoves(int loves) {
		this.loves = loves;
	}
}
