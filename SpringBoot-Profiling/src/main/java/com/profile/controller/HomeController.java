package com.profile.controller;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Endpoint(id = "ce")
public class HomeController 
{
	@ReadOperation
	public String CustomEndPoint()
	{
		return "This is custom EndPoint";
	}
}
