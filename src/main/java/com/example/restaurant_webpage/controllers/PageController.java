package com.example.restaurant_webpage.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String getHome() {
        return "home";
    }

}
