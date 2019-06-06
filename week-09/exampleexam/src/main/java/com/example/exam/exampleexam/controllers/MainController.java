package com.example.exam.exampleexam.controllers;

import com.example.exam.exampleexam.models.ResourceNotFoundException;
import com.example.exam.exampleexam.models.WebSite;
import com.example.exam.exampleexam.services.WebSiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    private WebSiteService service;

    @Autowired
    public MainController(WebSiteService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String mainPage() {
        return "index";
    }

    @GetMapping("/success")
    public String success(Model model,@RequestParam String alias) {
        model.addAttribute("success","Your URL is aliased to " + alias + " and your secret code is " +
                service.getSecretCode(alias) + ".");
        return "index";
    }

    @GetMapping("/fail")
    public String error(Model model) {
        model.addAttribute("message","Your alias is already in use!");
        return "index";
    }

    @PostMapping("/save-link")
    public String saveLink(@RequestParam String url, @RequestParam String alias) {
        WebSite webSite = service.createAlias(url,alias);
        if (webSite == null) {
            return "redirect:/fail";
        } else {
            return "redirect:/success?alias=" + alias;
        }
    }

    @GetMapping("/a/{alias}")
    public String hitAlias(@PathVariable String alias) {
        if (service.isPresent(alias)) {
            service.findByAlias(alias).incrementHitCount();
            service.saveWebite(service.findByAlias(alias));
            return "redirect:" + service.findByAlias(alias).getUrl();
        } else {
                throw new ResourceNotFoundException();
        }
    }
}
