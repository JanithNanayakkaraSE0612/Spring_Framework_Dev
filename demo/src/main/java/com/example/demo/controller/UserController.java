package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
//comment gg
@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class UserController {
    @GetMapping("/getUser")
    public String getUser(){
        return "Janith";
    }
    @PostMapping("/saveUser")
    public String saveUser(){
        return "User Saved!";
    }
    @PutMapping("/updateUser")
    public String updateUser(){
        return "Update User!";
    }
    @DeleteMapping("/deleteUser")
    public  String deleteUser(){
        return "Delete User!";
    }
}
