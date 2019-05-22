package com.greenfox.springinjection.dependencies.controllers;

import com.greenfox.springinjection.dependencies.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GfaController {

    StudentService studentService;

    @Autowired
    public GfaController(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping("/gfa")
    public String homePage(Model model) {
        return "GreenFox";
    }

    @RequestMapping("/gfa/list")
    public String studentList(Model model) {
        model.addAttribute("list",studentService.findAll());
        return "GreenFox";
    }

    @RequestMapping("/gfa/add")
    public String addStudent(Model model, @RequestParam String name) {
        model.addAttribute("newStudent",studentService.addStudent(name));
        return "Add";
    }
}
