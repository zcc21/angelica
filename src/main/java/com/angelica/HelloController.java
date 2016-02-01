package com.angelica;

import org.springframework.stereotype.Controller;

@Controller
public class HelloController {
	public String helloWorld() {
		return "Hello world!";
	}
	
	public String helloChina() {
		return "Hello China";
	}
	
}
