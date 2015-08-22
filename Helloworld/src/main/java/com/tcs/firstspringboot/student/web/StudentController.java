package com.tcs.firstspringboot.student.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@RequestMapping("/student/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
