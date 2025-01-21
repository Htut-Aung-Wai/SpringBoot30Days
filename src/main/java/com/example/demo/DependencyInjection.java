package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class DependencyInjection {

    public String Hello()
    {
        return "Hello this is DI injection ;";
    }

    public void DoNotReturn()
    {

        System.out.println("This is not return function and have to appear in console;;");
    }
}
