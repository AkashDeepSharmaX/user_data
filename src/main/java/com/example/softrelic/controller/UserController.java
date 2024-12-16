package com.example.softrelic.controller;

import com.example.softrelic.dtos.UserDto;
import com.example.softrelic.repository.UserRepository;
import com.example.softrelic.service.UserService;
import com.example.softrelic.domain.User;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")

public class UserController {
    @Autowired
    private final UserService userService;

    private final UserRepository userRepository;
    public UserController( UserService userService, UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }
    @GetMapping
    public List<User> watchUser() {
        return  userRepository.findAll();
    }

    @PostMapping()
    public User create(@Valid @RequestBody UserDto userDto, BindingResult result) {
        if(result.hasErrors()) {
            result.getAllErrors().stream().map((error) -> error.getDefaultMessage()).forEach(System.out::println);
            throw new RuntimeException("Request not valid");
        }
        return userService.createUser(userDto);
    }


}

