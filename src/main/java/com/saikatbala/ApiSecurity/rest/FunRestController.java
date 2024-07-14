package com.saikatbala.ApiSecurity.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	@GetMapping("/hello")
	public String hello() {
		return "hello Saikat";
	}
	
	@GetMapping("/test")
	public String test() {
		return "test bala";
	}

}
