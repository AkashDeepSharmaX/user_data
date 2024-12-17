package com.example.softrelic.controller;

import com.example.softrelic.dtos.UserDto;
import com.example.softrelic.repository.UserRepository;
import com.example.softrelic.service.UserService;
import com.example.softrelic.domain.User;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
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
    public ResponseEntity<List<User>> watchUser() {
        var data = userRepository.findAll();
//        List<User> data = userRepository.findAll();
        return new ResponseEntity<>(data, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<?> create(@Valid @RequestBody UserDto userDto, BindingResult result) {
        if(result.hasErrors()) {
            List<ObjectError> errors = result.getAllErrors();
            List<String> errorMessages = new ArrayList<>();
            for(int i = 0; i < errors.size(); i++){
               errorMessages.add(errors.get(i).getDefaultMessage());
            }
            return new ResponseEntity<>(errorMessages, HttpStatus.BAD_REQUEST) ;
        }
        return new ResponseEntity<>(userService.createUser(userDto), HttpStatus.OK);
    }


}

