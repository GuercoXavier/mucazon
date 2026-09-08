package com.guerco10.mucazon.controller;

import com.guerco10.mucazon.dto.UserDTO;
import com.guerco10.mucazon.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.guerco10.mucazon.service.UserService.users;

@RestController
public class UserController {


    // this controller is just to test if it is working or not
    @GetMapping("/")
    public String getMensagem(){
        return "Spring is working";
    }

    @GetMapping("/users")
    public List<UserDTO> getUsers(){
        UserService userService = new UserService();
        userService.initializeList();
        return users;
    }
}
