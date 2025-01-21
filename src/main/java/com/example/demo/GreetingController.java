package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    DependencyInjection DI;

    @Autowired
    public GreetingController(DependencyInjection DI)
    {

        this.DI=DI;
    }


    @GetMapping("/greeting")
    public String greeting() {

        return DI.Hello()+"Hello";

    }
}
