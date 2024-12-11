package com.example.softrelic.bootstrap;

import com.example.softrelic.Service.CommentsService;
import com.example.softrelic.Service.PostService;
import com.example.softrelic.Service.UserService;
import com.example.softrelic.domain.Comments;
import com.example.softrelic.domain.Post;
import com.example.softrelic.domain.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrap implements CommandLineRunner {
    private final UserService userService;
    private final PostService postService;
    private final CommentsService commentService;

    public BootStrap(UserService userService, PostService postService, CommentsService commentService) {
        this.userService = userService;
        this.postService = postService;
        this.commentService = commentService;
    }

    @Override
    public void run(String... args) {
//         Create Users
//            User user1 = new User();
//            user1.setEmail("jane.doe@example.com");
//            user1.setUsername("Jane_Doe");
//        User savedUser1 = userService.createUser(user1);
//        User user2 = userService.createUser("jane.doe@example.com", "Jane_Doe");

//         Create Posts
//            Post post = new Post();
//            post.setTitle("First Post");
//            post.setText("This is the first post by John.");
//            post.setUser(savedUser1);
//        var post1 = postService.createPost(post);
//        var post2 = postService.createPost(user2, "Hello World", "Jane is saying hello!");

//         Create Comments
//        commentService.createComment(user2, post1, "Nice post, John!");
//         commentService.createComment(user1, post1, "Thank you, Jane!");
    }
}


