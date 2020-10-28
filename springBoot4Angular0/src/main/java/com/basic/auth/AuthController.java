package com.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AuthController {
	
	@GetMapping(path = "/basic-auth")
	public AuthBean authBean() {
		return new AuthBean("You are authorized");
	}

}
