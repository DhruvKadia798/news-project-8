package com.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping(value = {"","/"})
	public String index(HttpServletRequest request) {
		return "Welcome to India";
	}
	
}
