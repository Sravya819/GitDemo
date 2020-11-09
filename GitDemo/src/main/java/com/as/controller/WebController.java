/**
 * 
 */
package com.as.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author asravya
 *
 */

@RestController
public class WebController {

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello!!!";
	}
	
	//Written by another developer
	@GetMapping("/hi")
	public String sayHi() {
		return "Hi!!!";
	}
	
}
