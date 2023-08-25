package com.adam.bookshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String getGreeting(Map<String, Object> model) {
        model.put("message", "Hello Adam");
        return "greeting";
    }

    @GetMapping("/thyme")
    public String getThymeleaf (Map<String, Object> model) {
        model.put("message", "Hello Thymeleaf");
        return "thyme";
    }
}
