package com.example.demo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public BeanTest out()
    {
        return new BeanTest("Hello this is bean test constructor");
    }


}
