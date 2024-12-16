package com.example.softrelic.dtos;

import com.example.softrelic.domain.Post;
import com.example.softrelic.domain.User;

public class CommentDto {
    private String text;
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

}
