package com.CITesting.controller;

import com.CITesting.model.User;
import com.CITesting.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test
{
    @Autowired
    UserService userService;

    @GetMapping("/test")
    public ResponseEntity<String> testApplication(){
        String msg = "Application Running on Properly";
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<String> addData(@RequestBody User user)
    {
        userService.saveuser(user);
        return new ResponseEntity<>("Done" , HttpStatus.CREATED);
    }
}
