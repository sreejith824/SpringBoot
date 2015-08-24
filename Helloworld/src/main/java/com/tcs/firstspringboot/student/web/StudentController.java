package com.tcs.firstspringboot.student.web;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.firstspringboot.student.bean.StudentConfigBean;

@RestController
public class StudentController {
	
	@Autowired
	private StudentConfigBean studentConfigBean;
	
	
	@PostConstruct
	@RequestMapping("/student/")
    public String index() {
		return "Greetings from " +studentConfigBean.getName() + " ! My first Spting boot app !!!<pre>" + studentConfigBean.getEmail();
    }

}
