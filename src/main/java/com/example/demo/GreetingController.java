package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    //Field Injection
    @Autowired
    DependencyInjection DI;


    //Constructor Injection
    @Autowired
    public GreetingController(DependencyInjection DI)
    {

        DI.ConstructorInjection();
    }

    //Setter Injection
    @Autowired
    public void SetterInjection(DependencyInjection DI)
    {
        DI.SetterInjection();
    }




    @GetMapping("/greeting")
    public String greeting() {

        DI.FieldInjection();

        return "hello";

    }
}
