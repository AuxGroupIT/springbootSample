package com.auxgroup.jpaSample.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auxgroup.jpaSample.service.PersonSay;

@RestController
public class Hello {
	
	@Resource
	private PersonSay say;
	
	@RequestMapping("/say")
	public String hello(){
		return say.say();
	}
	
	
	
}

