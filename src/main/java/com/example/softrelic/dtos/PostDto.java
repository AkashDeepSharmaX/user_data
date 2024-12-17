package com.example.softrelic.dtos;

import jakarta.validation.constraints.NotNull;

public class PostDto {
    @NotNull(message = "Username can not be null")
    private String text;
    @NotNull(message = "Username can not be null")
    private String title;

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

}
