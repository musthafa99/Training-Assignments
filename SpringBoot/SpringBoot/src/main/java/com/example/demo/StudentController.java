package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
	@RequestMapping("Home")
	@ResponseBody
	public String Details()
	{
		System.out.println("HI WELCOME STUDENTS DETAIL");
		return "Home.jsp";
	}
}
