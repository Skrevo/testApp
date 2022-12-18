package com.example.testapp.ui.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String load() {
        return "redirect:arithmeticExp";
    }
}
