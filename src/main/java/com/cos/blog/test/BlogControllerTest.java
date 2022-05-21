package com.cos.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

			
@RestController //스프링이  com.cos.blog 패키지 이하로 스캔해서 모든 메모리를 new 하는건 아님.
				//특정 어노테이션이 붙어있는 클래스 파일들을 new() 해서  ioc 스프링컨테이너에 관리해줌.
public class BlogControllerTest {
	
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>hello spring boot</h1>";
	}
	
}
