package com.springboot.controller.api.internal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.exception.AuthorizationException;

@RestController
public class HelloController {
	
	@RequestMapping(value = "/api/internal/hello", method = RequestMethod.GET)
	public String hello(@RequestParam("name") String name) {
		if (name.equals("yoshida")) {
			throw new AuthorizationException("AuthorizationException error.");
		}
		return "hello. " + name + "さん";
	}
}
