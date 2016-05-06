package com.example.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.Greeting;

@RestController
public class APPRESTController {
	
	@RequestMapping( "/getMessage")
	public Greeting getMessage(){
		
		return new Greeting("Hello");
	}

}
