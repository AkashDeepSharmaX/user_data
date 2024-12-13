package com.example.softrelic.controller;

import com.example.softrelic.domain.Post;
import com.example.softrelic.dtos.PostDto;
import com.example.softrelic.service.CommentsService;
import com.example.softrelic.service.PostService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comments")
public class CommentsController {
    private final CommentsService commentsService;

    public CommentsController(CommentsService commentsService) {
        this.commentsService = commentsService;
    }


   // @PostMapping({"postId"})
    }



