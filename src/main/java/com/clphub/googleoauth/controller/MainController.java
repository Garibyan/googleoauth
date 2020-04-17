package com.clphub.googleoauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/logged")
    public String restricted(){
//        return "You are Logged In";
        return "logged";
    }

}
