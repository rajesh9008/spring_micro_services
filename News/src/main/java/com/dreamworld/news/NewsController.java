package com.dreamworld.news;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsController {

    @GetMapping("/news")
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "hi " + name;
    }
}
