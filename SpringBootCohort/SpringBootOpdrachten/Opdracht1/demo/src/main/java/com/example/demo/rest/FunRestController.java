package com.example.demo.rest;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
public class FunRestController {

    // expose "/" that return "Hello World"

    @GetMapping("/hello")
    public String getHello(){
        return "Hello World! Time on the server is " + LocalDateTime.now();
    }

    @PostMapping("/hello")
    public String postHello(){
        return "Hello World! Time on the server is " + LocalDateTime.now();
    }

    @PutMapping("/hello")
    public String putHello(){
        return "Hello World! Time on the server is " + LocalDateTime.now();
    }

    @DeleteMapping("/hello")
    public String DeleteHello(){
        return "Hello World! Time on the server is " + LocalDateTime.now();
    }
}
