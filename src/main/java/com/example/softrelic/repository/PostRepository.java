package com.example.softrelic.repository;

import com.example.softrelic.domain.Post;
import com.example.softrelic.dtos.PostResponseDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    @Query(
            """
            select new com.example.softrelic.dtos.PostResponseDto(p.title,p.text, p.user.username) from Post p
            """
    )
    List<PostResponseDto> getPostsWithAuthor();
}

