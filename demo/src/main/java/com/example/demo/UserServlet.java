package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserServlet {
	
	Logger logger = LoggerFactory.getLogger(UserServlet.class);

	@RequestMapping("/index")
    public String index() {
		logger.info("hallo");
        return "Greetings from Spring Boot!";
    }
}
