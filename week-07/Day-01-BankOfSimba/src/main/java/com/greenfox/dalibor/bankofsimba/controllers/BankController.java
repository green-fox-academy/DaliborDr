package com.greenfox.dalibor.bankofsimba.controllers;

import com.greenfox.dalibor.bankofsimba.model.BankAccount;
import com.greenfox.dalibor.bankofsimba.model.BankAccounts;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BankController {
    BankAccount simba = new BankAccount("Simba",2000,"lion");
    BankAccounts bankAccounts = new BankAccounts();

    @RequestMapping("/show")
    public String showAcc(Model model) {
        model.addAttribute("Simba",simba);
        model.addAttribute("currency"," Zebra");
        return "index";
    }

    @RequestMapping("/web")
    public String showString(Model model) {
        model.addAttribute("veta","This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "string";
    }

    @RequestMapping("/showAccounts")
    public String showList(Model model) {
        model.addAttribute("accounts", bankAccounts.getAccounts());
        return "AccountList";
    }


}
