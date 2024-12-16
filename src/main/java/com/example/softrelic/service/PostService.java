package com.example.softrelic.service;

import com.example.softrelic.domain.Post;
import com.example.softrelic.domain.User;
import com.example.softrelic.dtos.PostDto;
import com.example.softrelic.repository.PostRepository;
import com.example.softrelic.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {
    private final UserRepository userRepository;
    private final PostRepository postRepository;

    public PostService(UserRepository userRepository, PostRepository postRepository) {
        this.userRepository = userRepository;
        this.postRepository = postRepository;
    }

    public Post createPost(PostDto postDto, Long userId) {
        Optional<User> userOptional = userRepository.findById(userId);
        if (userOptional.isEmpty()) {
            throw new RuntimeException("User not found with id: " + userId);
        }
        User user = userOptional.get();
        Post post = new Post();
        post.setText(postDto.getText());
        post.setTitle(postDto.getTitle());
        post.setUser(user);

        return postRepository.save(post);
    }
}
