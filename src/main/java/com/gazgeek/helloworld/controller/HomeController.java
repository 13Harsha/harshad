package com.gazgeek.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    String home() {
        return "Hello from GazGeek!";
        System.out.println("Hi Harsha");
		System.out.println("Hi Harsha");
        
    }

}
