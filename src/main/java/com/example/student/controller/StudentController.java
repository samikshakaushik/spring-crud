package com.example.student.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController 
{
	@GetMapping("/hello")
	public String display()
	{
		System.out.println("Hello");
		return "Hello";
	}
}
