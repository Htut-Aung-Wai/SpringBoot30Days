package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DI_AutoWired {
    //Field Injection
    @Autowired
    @Qualifier("Secondary") DependencyInjection DI;


    //Constructor Injection
    @Autowired
    public DI_AutoWired(@Qualifier("Secondary") DependencyInjection DI)
    {

        DI.ConstructorInjection();
    }

    //Setter Injection
    @Autowired
    public void SetterInjection(@Qualifier("Secondary") DependencyInjection DI)
    {
        DI.SetterInjection();
    }




    @GetMapping("/greeting")
    public String greeting() {

        DI.FieldInjection();

        return "hello";

    }
}
