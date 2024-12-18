package com.test.servive1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class Service1Controller {

    @Value("${custom.property}")
    private String customProperty;
	
    @GetMapping("/hello")
    public String hello() {
	    System.out.println("Custom Property Value: " + customProperty);
	    System.out.println("Hello triggered");
        return "Hello from Service 1!";
    }

}
