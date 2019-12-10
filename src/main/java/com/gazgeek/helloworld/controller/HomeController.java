package com.gazgeek.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    String home() {
    	
    	
    	
    	
		System.out.println("Hi Harsha");
        return "Hello from GazGeek!";
        
        
    }

}
