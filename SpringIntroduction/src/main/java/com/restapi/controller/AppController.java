package com.restapi.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
@RestController
@RequestMapping("/hello")

// controller class
public class AppController {

    // mapping is now on /hello
    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz";
    }
}