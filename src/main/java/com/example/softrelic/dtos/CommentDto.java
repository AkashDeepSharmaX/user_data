package com.example.softrelic.dtos;

import com.example.softrelic.domain.Post;
import com.example.softrelic.domain.User;

public class CommentDto {
    private String text;
    private Long UserId;
    private Long postId;

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public void setUserId(Long userId) {
        UserId = userId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Long getUserId() {
    }
}
