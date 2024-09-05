package com.example.testcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class finaltestcontroller {
    
    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to test";
    }
    @GetMapping("/people")
    public String people() {
        return "Good morning";
    }

    @GetMapping("/slay")
    public String slay() {
        return "Happy Teachers day";
    }






}
