package com.example.softrelic.Controller;

import com.example.softrelic.Repository.PostRepository;
import com.example.softrelic.Repository.UserRepository;
import com.example.softrelic.Service.UserService;
import com.example.softrelic.domain.Address;
import com.example.softrelic.domain.Post;
import com.example.softrelic.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/add")
    public User create(@RequestBody User user) {
        return userService.createUser(user);
    }

    @DeleteMapping("/remove/{id}")
    public void deleteuser(@PathVariable("id") Long id) {
        userService.delete(id);
    }
}


