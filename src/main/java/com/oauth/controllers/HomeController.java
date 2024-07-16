package com.oauth.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/home")
public class HomeController {
    @GetMapping(path = "/hello")
    public String hello(){
        return "Hello World!!";
    }

    @GetMapping(path = "/hello-secured")
    public String helloSecued(){
        return "Hello World Secured!!";
    }
}
