package com.example.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity // DB가 해당 객체를 인식 가능하게 된다!
public class Article {
	
	@Id // 대표값을 지정! like 주민등록번호
	@GeneratedValue // 1,2,3,... 자동생성 어노테이션! 
	private Long id; // pk값을 선언해야한다
	
	@Column // DB에서 이해할수 있도록 Column어노테이션 선언 
	private String title;
	@Column
	private String content;
	
	// 생성자
	public Article(Long id, String title, String content) {
		this.id = id;
		this.title = title;
		this.content = content;
	}
	// toString()
	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", content=" + content + "]";
	}
}
