package com.example.introspringboot.controller;

import com.example.introspringboot.entity.User;
import com.example.introspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping(path="/v1/users")
    public List<User> getAllUser() {
        return (List<User>) userService.findAll();
    }

    @GetMapping(path="/v1/user/{id}")
    public User getOneUser(@PathVariable("id") Long id) {
        return userService.findOne(id);
    }

    @PostMapping(path = "/v1/user")
    public User createUser(@RequestBody User user) {
        return userService.create(user);
    }

    @PutMapping(path = "/v1/user")
    public User updateUser(@RequestBody User user) {
        return userService.update(user);
    }

    @DeleteMapping(path = "/v1/user/{id}")
    public void deleteUser(@PathVariable("id") Long id) {
        userService.deleteOne(id);
    }
}
