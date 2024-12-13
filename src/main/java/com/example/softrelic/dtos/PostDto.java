package com.example.softrelic.dtos;

import com.example.softrelic.domain.User;

import java.time.LocalDateTime;

public class PostDto {
    private  String text;
    private String title;
    private LocalDateTime createAt;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }
}
