package com.guerco10.mucazon.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController {


    // this controller is just to test if it is working or not
    @GetMapping("/")
    public String getMensagem(){
        return "Spring is working";
    }
}
