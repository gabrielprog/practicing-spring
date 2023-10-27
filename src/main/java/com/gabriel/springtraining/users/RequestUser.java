package com.gabriel.springtraining.users;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class RequestUser {
    
    @GetMapping("/")
    public String testUser() {
        return "So um teste";
    }
}