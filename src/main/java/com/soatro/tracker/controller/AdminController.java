package com.soatro.tracker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    @GetMapping("/")
    public String home(){
        return ("<h1>Welcome</h1>");
    }

}
