package com.greenfox.springstart.controllers;

import org.omg.CORBA.MARSHAL;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {



    Hello hello = new Hello();
    AtomicLong counter = new AtomicLong(0);
    public String style() {
        int rand = (int) (Math.random() * 255);
        String num = Integer.toString(rand);
        return "color: rgb(" + num + "," + num + "," + num + ")";
    }
    @RequestMapping("/web/greeting")
    public String greeting(Model model, @RequestParam String name) {
        model.addAttribute("name", name);
        model.addAttribute("id",counter.getAndIncrement());
        model.addAttribute("hello",hello.getRandomString());
        model.addAttribute("style",style());

        return "greeting";
    }




}
