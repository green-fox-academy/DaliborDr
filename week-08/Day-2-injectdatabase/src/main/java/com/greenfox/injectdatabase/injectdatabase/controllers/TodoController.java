package com.greenfox.injectdatabase.injectdatabase.controllers;

import com.greenfox.injectdatabase.injectdatabase.repository.TodoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller("/todo")
public class TodoController {

    private TodoInterface repo;



    @Autowired
    public TodoController(TodoInterface repo) {
        this.repo = repo;
    }

    @GetMapping({"/","/list"})
    public String list(Model model, @RequestParam(required = false) boolean isActive) {
        model.addAttribute("todoList",repo.findAll());
        return "todolist";
    }





}
