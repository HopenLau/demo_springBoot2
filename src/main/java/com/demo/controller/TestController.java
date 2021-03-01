package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Springboot嘅入門案例，實現基於springboot嘅springmvc配置。
 * 
 * @author Hopen
 *
 */
//@ResponseBody
//@Controller
@RestController
@RequestMapping("/springboot2")
public class TestController {

	@RequestMapping("/hello")
	public String handle() {
		return "Hello, SpringBoot2!";
	}
}
