package com.sts1.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController1 {
	
	@RequestMapping(value="/books",method=RequestMethod.GET)
	public String getBooks() {
		return "this is a java book";
	}
	@RequestMapping(value="/hello",method=RequestMethod.GET)
    public String sayHi() {
		return "hi";
	}
	@RequestMapping(value="/product",method=RequestMethod.GET)
	public String  getProduct() {
		return "this is product";
	}
}
