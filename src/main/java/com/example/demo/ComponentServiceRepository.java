package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Component
public class ComponentServiceRepository {
    @Autowired
    Components compo;
    @Autowired
    Services ser;
    @Autowired
    Repo rep;




    public void output()
    {
        System.out.println(compo.ReturnComponents());
        ser.ReturnService();
        rep.ReturnRepo();
    }






}


@Component
class Components{

    public Components()
    {

    }
    public String ReturnComponents()
    {
        return "This is component";
    }


}

@Service
class Services{

    public Services()
    {

    }

    public void ReturnService()
    {
        System.out.println("This is Service");
    }

}

@Repository
class Repo{

    public Repo()
    {

    }
    public void ReturnRepo()
    {
        System.out.println("This is Repo");
    }


}


