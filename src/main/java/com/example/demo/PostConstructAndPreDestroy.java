package com.example.demo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class PostConstructAndPreDestroy {

    @PostConstruct
    public void PostConstruct()
    {

        System.out.println("This is PreConstruct ;;");
    }

    @PreDestroy
    public void PreDestroy()
    {
        System.out.println("This is PreDestory ;;");
    }
}
