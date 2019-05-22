package com.greenfox.springinjection.dependencies.controllers;

import com.greenfox.springinjection.dependencies.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CollorController {

    UtilityService utilityService;

    @Autowired
    public CollorController(UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @RequestMapping("/useful")
    public String home(Model model) {
        return "index";
    }

    @RequestMapping("/useful/colored")
    public String coloredPage(Model model) {
        model.addAttribute("randomColor", utilityService.randomColor());
        return "Index";
    }

    @RequestMapping("/useful/email")
    public String emailValidator (Model model, @RequestParam String email) {
        if (utilityService.validateEmail(email)) {
            model.addAttribute("valid",email + "is a valid email address");
            model.addAttribute("color","green");
        } else {
            model.addAttribute("valid",email + "is not a valid email address");
            model.addAttribute("color", "red");
        }
        return "Index";
    }

    @RequestMapping("/useful/encoder")
    public String caesar(Model model, @RequestParam String text, @RequestParam int number) {
        model.addAttribute("encode",utilityService.caesar(text,number));
        return "Index";
    }
    @RequestMapping("/useful/decoder")
    public String caesarDecode(Model model, @RequestParam String text, @RequestParam int number) {
        model.addAttribute("decode", utilityService.caesar(text, -number));
        return "Index";
    }

}
