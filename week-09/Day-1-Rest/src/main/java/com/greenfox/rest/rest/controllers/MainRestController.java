package com.greenfox.rest.rest.controllers;

import com.greenfox.rest.rest.models.*;
import com.greenfox.rest.rest.models.Error;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

    @GetMapping("/doubling")
    public Object doubling(@RequestParam(value = "input", required = false) Integer received) {
        if (received != null) {
            return new Dabl(received);
        } else {
            Error error = new Error("Please provide an input!");
            return error;
        }
    }

    @GetMapping("/greeter")
    public Object greeter(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
        if (name == null && title == null) {
            return new Error("Please provide a name and a title!");
        } else if (name == null) {
            return new Error("Please provide a name!");
        } else if (title == null) {
            return new Error("Please provide a title!");
        }
        Greeter greeter = new Greeter(name,title);
        return greeter;
    }

    @GetMapping("/appenda/{appendable}")
    public Object append(@PathVariable(required = false) String appendable) {
        if (appendable != null) {
            return new Append(appendable + "a");
        } else {
            throw new ResourceNotFoundException();
        }
    }



}
