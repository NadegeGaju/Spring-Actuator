package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/menu")
    public String menu() {
        return "home";
    }

    @GetMapping("/manager")
    public String boss() {
        return "boss";
    }

    @GetMapping("/client")
    public String customer() {
        return "customer";
    }
}