package com.smart.controller;

import com.smart.entities.User;
import com.smart.dao.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/create")
    public User create(@Valid @RequestBody User user) {
        return userRepository.save(user);
    }
}