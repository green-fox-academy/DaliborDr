package com.greenfox.demo.controllers;

import com.greenfox.demo.models.Post;
import com.greenfox.demo.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    PostRepository repo;

    @Autowired
    public PostController(PostRepository repo) {
        this.repo = repo;
    }

    @RequestMapping("/")
    public String postMain(Model model) {
        model.addAttribute("showAll", repo.findAll());

        return "post";
    }

    @RequestMapping("/newPost")
    public String newPost() {
        return "newPost";
    }

    @GetMapping("/increment/{id}")
    public String increment(@PathVariable long id) {
        Post post = repo.findById(id).get();
        post.increment();
        repo.save(post);
        return "redirect:/";
    }

    @GetMapping("/decrement/{id}")
    public String decrement(@PathVariable long id) {
        Post post = repo.findById(id).get();
        post.decrement();
        repo.save(post);
        return "redirect:/";
    }

    @PostMapping("/newPost")
    public String createPost(String title, String url) {
        repo.save(new Post(title,url));
        return "redirect:/";
    }


}
