package com.aa.demo.sonar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

	@GetMapping
	public String firstTest() {
		System.out.println("start...");
		return "FirstController test success!!";
	}
	
}
