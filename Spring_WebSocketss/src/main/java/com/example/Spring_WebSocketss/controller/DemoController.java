package com.example.Spring_WebSocketss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class DemoController {
//    @Autowired
//    private SeviceForController seviceForController;


     Persons persons = new Persons();
    Persons persons = new Persons(Person);
    @GetMapping("/name")
    public String getData(String name){
        return name;

    }
    @PostMapping("/add")
        public String addData(String name){

        return name;
        }
    }


