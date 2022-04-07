package com.my.simplewebservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    @GetMapping("/")
    public String hi() {
        return "Web Service Na Jaaa";
    }
}
