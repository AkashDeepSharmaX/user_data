package com.example.softrelic.controller;

import com.example.softrelic.domain.Post;
import com.example.softrelic.dtos.PostDto;
import com.example.softrelic.service.PostService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/posts")
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping("/{userId}")
    public Post createPost(@RequestBody PostDto postDto , @PathVariable Long userId) {
        return postService.createPost(postDto,userId);
    }

}

