package com.example.demo;

public class BeanTest {

    private String ahello="hello";
    private String b="hi";

    public BeanTest(String b)
    {
        System.out.println("This bean is configured in AppConfig.java");
        this.b=b;
    }

    public void hello()
    {
        System.out.println(b);
    }

}
