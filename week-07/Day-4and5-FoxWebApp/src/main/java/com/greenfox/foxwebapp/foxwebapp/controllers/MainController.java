package com.greenfox.foxwebapp.foxwebapp.controllers;

import com.greenfox.foxwebapp.foxwebapp.models.Fox;
import com.greenfox.foxwebapp.foxwebapp.services.FoxServiceUtilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class MainController {

    @Autowired
    FoxServiceUtilities foxServiceUtilities;

    @RequestMapping("/")
    public String start(Model model, @RequestParam String name) {
        foxServiceUtilities.checkIfExists(name);
        model.addAttribute("name",foxServiceUtilities.getFoxes().get(0).getName());
        if (foxServiceUtilities.getFoxes().get(0).getTricks().size() != 0) {
            model.addAttribute("numOfTricks", foxServiceUtilities.getFoxes().get(0).getTricks().size());
            model.addAttribute("ListOfTricks",foxServiceUtilities.getFoxes().get(0).getTricks());
        } else {
            model.addAttribute("message", "You know no tricks,yet. Go and learn some.");
        }
        return "index";
    }

    @RequestMapping(path = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @PostMapping(path = "/login")
    public String writeLogin(@RequestParam String name) {
        return "redirect:/?name=" + name;
    }

    @RequestMapping(path = "/nutritionStore")
    public String showStore(Model model, @RequestParam String name) {
        model.addAttribute("ListOFFood",foxServiceUtilities.getFoxes().get(0).getFood());
        model.addAttribute("ListOFDrinks",foxServiceUtilities.getFoxes().get(0).getDrink());
        model.addAttribute("name",name);
        return "store";
    }

    @RequestMapping(path = "/trickCenter")
    public String showTrickCenter(@RequestParam String name) {
        return "trick";
    }

}
