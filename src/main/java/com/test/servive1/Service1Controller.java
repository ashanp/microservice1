package com.test.servive1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service1Controller {
	
    @GetMapping("/hello")
    public String hello() {
	    System.out.println("Hello triggered");
        return "Hello from Service 1!";
    }

}
