package com.greenfox.dadis.databasespring.controllers;

import com.greenfox.dadis.databasespring.models.Todo;
import com.greenfox.dadis.databasespring.repository.TodoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller("/todo")
public class TodoController {

    private TodoInterface repo;



    @Autowired
    public TodoController(TodoInterface repo) {
        this.repo = repo;
    }

    @GetMapping({"/","/list"})
    public String list(Model model) {
        model.addAttribute("todoList",repo.findAll());
        return "todolist";
    }





}
