package com.example.softrelic.controller;

import com.example.softrelic.domain.Post;
import com.example.softrelic.dtos.CommentDto;
import com.example.softrelic.dtos.PostDto;
import com.example.softrelic.service.CommentsService;
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
@RequestMapping("/comments")
public class CommentsController {
    private final CommentsService commentsService;

    public CommentsController(CommentsService commentsService) {
        this.commentsService = commentsService;
    }


    @PostMapping({"postId"})
    public ResponseEntity<?> createComment(@Valid @RequestBody CommentDto commentDto, @PathVariable long postId ,long userId, BindingResult result){
        if (result.hasErrors()){
            List<ObjectError> errors = result.getAllErrors();
            List<String> errorMessages = new ArrayList<>();
            for(int i = 0; i < errors.size(); i++){
                errorMessages.add(errors.get(i).getDefaultMessage());
            }
            return new ResponseEntity<>(errorMessages, HttpStatus.BAD_REQUEST) ;

        }
   return new ResponseEntity<>(commentsService.createComment(commentDto,postId ,userId),HttpStatus.OK);

    }
    }



