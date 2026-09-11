package com.guerco10.mucazon.controller;

import com.guerco10.mucazon.dto.UserDTO;
import com.guerco10.mucazon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    //injection via constructor
//    public UserController(UserService userService){
//        this.userService = userService;
//    }

    // this controller is just to test if it is working or not
    @GetMapping("/")
    public String getMensagem(){
        return "Spring is working";
    }

    @GetMapping("/users")
    public List<UserDTO> getUsers(){
//        UserService userService = new UserService();
//        userService.initializeList();
        return userService.getAll();
    }

    // gets a specific user
    @GetMapping("/users/{id}")
    public UserDTO getUserById(@PathVariable Long id){

        return userService.findById(id);
    }

    @GetMapping("/users/idCard/{idCard}")
    public UserDTO getUserByIdCard(@PathVariable String idCard){

        return userService.findByIdCard(idCard);
    }

    @GetMapping("user/search")
    List<UserDTO> queryByName(@RequestParam(name = "name", required = true) String name){
        //required is true by default but just to make it clearer we'll keep like this
        return userService.queryByName(name);
    }

    @PostMapping("/newUser")
    UserDTO addUser(@RequestBody UserDTO userDTO){

        return userService.save(userDTO);
    }

    @DeleteMapping("/user/{id}")
    UserDTO deleteUser(@PathVariable long id){

        return userService.delete(id);
    }

}
