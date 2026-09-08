package com.guerco10.mucazon.controller;

import com.guerco10.mucazon.dto.UserDTO;
import com.guerco10.mucazon.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.guerco10.mucazon.service.UserService.users;

@RestController
public class UserController {
    private final UserService userService = new UserService();

    // this controller is just to test if it is working or not
    @GetMapping("/")
    public String getMensagem(){
        return "Spring is working";
    }

    @GetMapping("/users")
    public List<UserDTO> getUsers(){
//        UserService userService = new UserService();
//        userService.initializeList();
        return users;
    }

    // gets a specific user
    @GetMapping("/users/{idCard}")
    public UserDTO getUser(@PathVariable String idCard){
        return userService.getUser(idCard);
    }

    @PostMapping("/newUser")
    UserDTO addUser(@RequestBody UserDTO userDTO){

        return userService.addUser(userDTO);
    }

    @DeleteMapping("/user/{idCard}")
    boolean deleteUser(@PathVariable String idCard){
        return userService.removeUser(idCard);
    }

}
