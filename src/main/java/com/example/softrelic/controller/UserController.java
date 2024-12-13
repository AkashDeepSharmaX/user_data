package com.example.softrelic.controller;

import com.example.softrelic.dtos.UserDto;
import com.example.softrelic.repository.UserRepository;
import com.example.softrelic.service.UserService;
import com.example.softrelic.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")

public class UserController {
    @Autowired
    private final UserService userService;

    private final UserRepository userRepository;
    public UserController( UserService userService1, UserRepository userRepository) {
        this.userService = userService1;
        this.userRepository = userRepository;
    }
    @GetMapping
    public List<User> watchUser() {
        return  userRepository.findAll();
    }

    @PostMapping()
    public User create(@RequestBody UserDto userDto) {
        return userService.createUser(userDto);
    }


}

