package com.example.softrelic.Service;

import com.example.softrelic.Repository.PostRepository;
import com.example.softrelic.Repository.UserRepository;
import com.example.softrelic.domain.Post;
import com.example.softrelic.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {
    private final UserRepository userRepository;

    private final PostRepository postRepository;
    public PostService(UserRepository userRepository, PostRepository postRepository) {
        this.userRepository = userRepository;
        this.postRepository = postRepository;}

        public Post createPost(Post post){
        return postRepository.save(post);
        }
    public Post create(Post post, Long userId) {
        return postRepository.save(post);
    }
    public Post findBy(Long userId){
        Optional<Post> optionalPost = postRepository.findById(userId);
        if (optionalPost.isPresent()) {
            return optionalPost.get();
        }
        throw new RuntimeException("book not find");
    }
}
