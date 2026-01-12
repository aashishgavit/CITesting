package com.CITesting.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test
{
    @GetMapping("/test")
    public ResponseEntity<String> testApplication(){
        String msg = "Application Running on Properly";
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }
}
