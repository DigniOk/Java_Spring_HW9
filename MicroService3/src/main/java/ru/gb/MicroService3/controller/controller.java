package ru.gb.MicroService3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service3")

public class controller {

    @GetMapping("/Hello")
    public String hello(){
        return "Hello form microservice 3";
    }
}