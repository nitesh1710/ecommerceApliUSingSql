package com.second.secondtry.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class trymyfile2 {
    @GetMapping(value= "/try2")
    public String GetTry(){
        String name= "My name is Nitesh Choudhary";
        return name;
    }
    @PutMapping(value="/try2")
    public String PutTry(){
        String name =" My name is Roshan Choudhary";
        return name;
    }
    @DeleteMapping(value="/try2")
    public String DeleteTry(){
        String name ="I nitesh  i am deleting my name from here";
        return name;
    }
    @PostMapping(value = "/try2")
    public String PostTry(){
        String name= "i am posting with whatever is left";
        return name;
    }



}
