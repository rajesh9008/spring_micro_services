package com.dreamworld.authserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {


    @RequestMapping(value = "/current", method = RequestMethod.GET)
    public String getUser() {
        return "raj";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String createUser(@Valid String user) {
        return user + "success";
    }
}
