package com.example.softrelic.controller;

import com.example.softrelic.dtos.CommentDto;
import com.example.softrelic.service.CommentsService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentsController {
    private final CommentsService commentsService;

    public CommentsController(CommentsService commentsService) {
        this.commentsService = commentsService;
    }

    @PostMapping("/{postId}/{userId}")
    public ResponseEntity<?> createComment(@Valid @RequestBody CommentDto commentDto, @PathVariable long postId, @PathVariable long userId,
            BindingResult result) {
        if (result.hasErrors()) {
            List<String> errorMessages = new ArrayList<>();
            for (ObjectError error : result.getAllErrors()) {
                errorMessages.add(error.getDefaultMessage());
            }
            return new ResponseEntity<>(errorMessages, HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>(commentsService.createComment(commentDto, postId, userId), HttpStatus.OK);
    }
}
