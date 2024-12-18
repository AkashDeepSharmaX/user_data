package com.example.softrelic.service;

import com.example.softrelic.dtos.CommentDto;
import com.example.softrelic.domain.Comments;
import com.example.softrelic.domain.Post;
import com.example.softrelic.domain.User;
import com.example.softrelic.repository.CommentsRepository;
import com.example.softrelic.repository.PostRepository;
import com.example.softrelic.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CommentsService {
    private final CommentsRepository commentsRepository;
    private final PostRepository postRepository;
    private final UserRepository userRepository;

    public CommentsService(CommentsRepository commentsRepository, PostRepository postRepository, UserRepository userRepository) {
        this.commentsRepository = commentsRepository;
        this.postRepository = postRepository;
        this.userRepository = userRepository;
    }

    public Comments createComment(CommentDto commentDto, Long postId, Long userId) {
        Optional<Post> postOptional = postRepository.findById(postId);
        if (postOptional.isEmpty()) {
            throw new RuntimeException("Post not found with id: " + postId);
        }

        Optional<User> userOptional = userRepository.findById(userId);
        if (userOptional.isEmpty()) {
            throw new RuntimeException("User not found with id: " + userId);
        }

        Post post = postOptional.get();
        User user = userOptional.get();

        Comments comment = new Comments();
        comment.setText(commentDto.getText());
        comment.setPost(post);
        comment.setUser(user);

        return commentsRepository.save(comment);
    }
}
