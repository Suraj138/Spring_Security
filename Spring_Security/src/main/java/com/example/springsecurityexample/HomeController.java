package com.example.springsecurityexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Welcome to home page";
    }

    @GetMapping("/user")
    public String user() {
        return "Welcome to the user page";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Welcome to the admin page";
    }
}
