package com.activemq.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.activemq.rest.client.Client;

@RestController
public class WebController {
	
	@Autowired
	Client jsmClient;
	
	@RequestMapping(value="/produce")
	public String produce(@RequestParam("msg")String msg){
		jsmClient.send(msg);
		return "Done";
	}
}
