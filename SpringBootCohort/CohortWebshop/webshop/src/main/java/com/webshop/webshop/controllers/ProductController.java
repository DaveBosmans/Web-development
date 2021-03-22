package com.webshop.webshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    @GetMapping("")
    public String viewHomePage() {
        return "index";
    }
}
