package com.example.softrelic.dtos;

import com.example.softrelic.domain.Post;
import com.example.softrelic.domain.User;
import jakarta.validation.constraints.NotEmpty;

public class CommentDto {
    @NotEmpty(message = "text can not be empty")
    private String text;
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

}
