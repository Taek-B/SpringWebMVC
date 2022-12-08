package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TestController {

//	@RequestMapping(value ="/test1", method = RequestMethod.GET)
//	public String test1_get() {
//		return "test1";
//	}
//
//	@RequestMapping(value ="/test2", method = RequestMethod.POST)
//	public String test2_post() {
//		return "test2";
//	}
	
	@GetMapping("/test1")
	public String test1_get() {
		return "test1";
	}

	@PostMapping("/test2")
	public String test2_post() {
		return "test2";
	}
	
	@GetMapping("/test3")
	public String test3_get() {
		return "test3_get";
	}
	
	@PostMapping("/test3")
	public String test3_post() {
		return "test3_post";
	}
}
