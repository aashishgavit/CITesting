package com.CITesting.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test
{
    @GetMapping("/hello")
    public String hello() {
        return "Hello from Simple String API!";
    }
}
