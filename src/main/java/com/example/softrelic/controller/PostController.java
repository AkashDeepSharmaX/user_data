package com.example.softrelic.controller;

import com.example.softrelic.domain.Post;
import com.example.softrelic.dtos.PostDto;
import com.example.softrelic.repository.PostRepository;
import com.example.softrelic.service.PostService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {
    private PostService postService;
    private PostRepository postRepository;
    public PostController(PostService postService, PostRepository postRepository) {
        this.postService = postService;
        this.postRepository = postRepository;
    }

    @PostMapping("/{userId}")
    public ResponseEntity<?> createPost(@RequestBody @Valid  PostDto postDto , @PathVariable Long userId ,BindingResult result) {
        if(result.hasErrors()) {
            List<ObjectError> errors = result.getAllErrors();
            List<String> errorMessages = new ArrayList<>();
            for(int i = 0; i < errors.size(); i++){
                errorMessages.add(errors.get(i).getDefaultMessage());
            }
            return new ResponseEntity<>(errorMessages, HttpStatus.BAD_REQUEST) ;

    }
            return new ResponseEntity<>(postService.createPost(postDto,userId),HttpStatus.OK);

}

}