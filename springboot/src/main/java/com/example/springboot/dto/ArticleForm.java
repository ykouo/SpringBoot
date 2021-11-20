package com.example.springboot.dto;

import com.example.springboot.entity.Article;

public class ArticleForm {
	
	// 멤버변수
	private String title;
	private String content;
	
	// 생성자 
	public ArticleForm(String title, String content) {
		this.title = title;
		this.content = content;
	}
	
	// Getter & Setter ()
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	// toString()
	@Override
	public String toString() {
		return "ArticleForm [title=" + title + ", content=" + content + "]";
	}

	public Article toEntity() {
		
		return new Article(null,title,content);
	}	
}
