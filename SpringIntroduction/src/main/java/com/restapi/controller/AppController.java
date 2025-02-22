package com.restapi.controller;
import org.springframework.web.bind.annotation.*;


// controller class
@RestController
@RequestMapping("/hello")
public class AppController {

    // mapping is now on /hello
    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

    @GetMapping("/query")
    public String sayHelloWithName(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    @GetMapping("/param/{name}")
    public String sayHelloWithPath(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }
}