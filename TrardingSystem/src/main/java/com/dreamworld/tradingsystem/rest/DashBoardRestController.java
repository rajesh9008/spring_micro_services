package com.dreamworld.tradingsystem.rest;

import com.dreamworld.tradingsystem.services.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DashBoardRestController {

    @Autowired
    private AccountServiceImpl accountService;

    @GetMapping("/dashboard")
    public String getDashBoardData(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "hi " + accountService.create(name);
    }
}
