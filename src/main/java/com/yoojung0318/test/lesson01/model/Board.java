package com.yoojung0318.test.lesson01.model;

// class 생성 -> 멤버변수로 사용
public class Board {
	//제목,작성자,게시글
	private String title;
	private String user;
	private String content;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
