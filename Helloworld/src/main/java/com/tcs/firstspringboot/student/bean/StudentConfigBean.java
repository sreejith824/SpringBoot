package com.tcs.firstspringboot.student.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="student")
public class StudentConfigBean {

	private String name;
	private String email;
	
	public StudentConfigBean() {
		System.out.println("Inside StudentConfigBean constructor");
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
}
