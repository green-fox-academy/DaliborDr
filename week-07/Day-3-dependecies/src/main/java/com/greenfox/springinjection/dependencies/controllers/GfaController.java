package com.greenfox.springinjection.dependencies.controllers;

import com.greenfox.springinjection.dependencies.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class GfaController {

    StudentService studentService;

    @Autowired
    public GfaController(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping("/gfa")
    public String homePage(Model model) {
        model.addAttribute("numOfStudents","We have: " + studentService.countStudents() + " Students");
        return "GreenFox";
    }

    @RequestMapping("/gfa/list")
    public String studentList(Model model) {
        model.addAttribute("list",studentService.findAll());
        return "GreenFox";
    }

    @RequestMapping("/gfa/save")
    public String addStudent(String name) {
        studentService.save(name);
        return "redirect:/gfa/list";
    }

    @RequestMapping("/gfa/add")
    public String addStudent() {
        return "Add";
    }

    @RequestMapping("/gfa/check")
    public String check() {
        return "Check";
    }

    @PostMapping("/gfa/check")
    public String checkStudent(Model model, String name) {
        model.addAttribute("message",studentService.isPresent(name));
        return "Check";
    }
}
