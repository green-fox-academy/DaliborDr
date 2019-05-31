package com.greenfox.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PostController {

    @RequestMapping("/")
    public String postMain() {
        return "post";
    }

    @RequestMapping("/newPost")
    public String newPost() {
        return "newPost";
    }

    @PostMapping("/newPost")
    public String createPost() {
        return "redirect:/";
    }


}
