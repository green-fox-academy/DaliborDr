package com.greenfox.springstart.controllers;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {



    @RequestMapping()
    public Greeting greeting(@RequestParam String name) {
        Greeting greeting = new Greeting("Hello " + name);
        return greeting;
    }



}
