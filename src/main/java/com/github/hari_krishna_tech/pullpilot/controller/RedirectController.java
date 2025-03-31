package com.github.hari_krishna_tech.pullpilot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedirectController {


    @GetMapping("/redirect")
    public String redirect() {
        return "redirect:http://localhost:5173/";
    }
}
