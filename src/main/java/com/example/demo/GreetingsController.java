package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @RequestMapping("/greeting")
    public String getGreeting() {
        return "Hi Welcome to SJ first SpringBoot framework!";
    }

}
