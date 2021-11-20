package com.example.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.springboot.entity.Article;

public interface ArticleRepository extends CrudRepository<Article, Long> { 
	// JPA에서 제공하는 Repository인터페이스를 활용 
	//  CrudRepository<관리대상entity, pk값의 타입>
}
