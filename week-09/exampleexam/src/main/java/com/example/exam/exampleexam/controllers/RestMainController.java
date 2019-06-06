package com.example.exam.exampleexam.controllers;

import com.example.exam.exampleexam.models.WebSite;
import com.example.exam.exampleexam.services.WebSiteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestMainController {

    private WebSiteService service;

    public RestMainController(WebSiteService service) {
        this.service = service;
    }

    @GetMapping("/api/links")
    public List<WebSite> showLinks() {
       return service.findAllWebSites();
    }
}
