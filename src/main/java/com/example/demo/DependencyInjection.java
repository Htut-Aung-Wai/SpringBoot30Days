package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class DependencyInjection {

    public String Hello()
    {
        return "Hello this is DI injection ;";
    }

    public void FieldInjection()
    {

        System.out.println("This is field Injection");

    }
    public void ConstructorInjection()
    {
        System.out.println("This is Constructor Injection");
    }

    public void SetterInjection()
    {
        System.out.println("This is Setter Injection");
    }
}
