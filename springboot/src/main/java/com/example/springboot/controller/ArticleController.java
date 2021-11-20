package com.example.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.springboot.dto.ArticleForm;
import com.example.springboot.entity.Article;
import com.example.springboot.repository.ArticleRepository;

@Controller // 컨트롤러임을 명시한다. 
public class ArticleController {
	
	@Autowired //스프링부트가 미리 생성해놓은 객체를 가져다가 자동 연결!
	private ArticleRepository articleRepository;
	// 원래대로라면 객체를 생성해야함 (new 연산자 사용) 그러나 우리는 Autowired라는 어노테이션 사용을 
	// 하면서 스프링부트가 미리 생성해놓은 객체를 가져다가 자동으로 연결해준다. 
	
	@GetMapping("/articles/new")
	public String newArticleForm() {
		return "articles/new";
	}
	
	// form태그에서 post방식으로 정보를 주고 받기 때문에 mapping도 PostMapping을 사용한다. 
	@PostMapping("/articles/create")
	public String createArticle(ArticleForm form) {
		System.out.println(form.toString());
		// 1. DTO를 Entity로 변환!
		Article article = form.toEntity();
		System.out.println(article.toString());
		// 2. Repository에게 Entity를 DB안에 저장하게 함!
		Article saved=articleRepository.save(article); //save를 사용할수 있음 
		System.out.println(saved.toString());
		
		
		return "";
	}
}
