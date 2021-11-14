package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
	
	@GetMapping("/hi") // hi 라는 url을 입력받으면 greetings.mustache라는 페이지를 리턴한다. 
	public String niceToMeetYou(Model model) { 
		model.addAttribute("username","yk"); 
		// username이라는 변수에 yk라는 내용을  셋팅
		// 컨트롤러를 통해 greetings.mustache페이지로 값을 넘겨준다.
		// 이전의 Model클래스에서 하는 행동이다. 
		return "greetings"; // templates/greetings.mustache → 브라우저로 전송!
	}
}
