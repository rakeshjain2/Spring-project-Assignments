package com.rakesh.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cal")
public class TestController {

	@GetMapping("/add")
	@ResponseBody
	public String add() {
		int a=5;
		int b=10;
		int c= a+b;
		System.out.println("Addition is :"+c);
		return "Addition is "+c;
	}
	
	@GetMapping("/sub")
	@ResponseBody
	public String sub() {
		int a=5;
		int b=10;
		int c= a-b;
		System.out.println("Substration is :"+c);
		return "Substration is "+c;
	}
	
	@GetMapping("/mul")
	@ResponseBody
	public String mul() {
		int a=5;
		int b=10;
		int c= a*b;
		System.out.println("Multipilication is :"+c);
		return "Multipilication is "+c;
	}
	
	@GetMapping("/div")
	@ResponseBody
	public String div() {
		int a=50;
		int b=10;
		int c= a/b;
		System.out.println("division is :"+c);
		return "Division is "+c;
	}
}
