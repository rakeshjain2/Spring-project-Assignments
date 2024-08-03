package com.rakesh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rakesh.services.TestService;

@RestController
@RequestMapping("/endpoints")
public class TestController {

	@Autowired
	private TestService testService;
	
	
	@GetMapping("/add")
	@ResponseBody
	public String add() {
		
		return testService.add();
	}
	
	@GetMapping("/update")
	@ResponseBody
	public String update() {
		
		return testService.update();
	}
	
	@GetMapping("/delete")
	@ResponseBody
	public String delete() {
		
		return testService.delete();
	}
	
	@GetMapping("/get")
	@ResponseBody
	public String get() {
		
		return testService.get();
	}
	
	@GetMapping("/getAll")
	@ResponseBody
	public String getAll() {
		
		return testService.getAll();
	}
	
	
	
}
