package com.greenfox.rest.rest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @RequestMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/doubling")
    public String doubling(@RequestParam int input) {
        int a = input * 2;
        return a;
    }
}
