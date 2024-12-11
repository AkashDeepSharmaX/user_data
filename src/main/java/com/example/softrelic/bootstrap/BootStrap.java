//package com.example.softrelic.bootstrap;
//
//import com.example.softrelic.Service.CommentsService;
//import com.example.softrelic.Service.PostService;
//import com.example.softrelic.Service.UserService;
//import com.example.softrelic.domain.Comments;
//import com.example.softrelic.domain.User;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class BootStrap implements CommandLineRunner {
//    private final UserService userService;
//    private final PostService postService;
//    private final CommentsService commentService;
//
//    public BootStrap(UserService userService, PostService postService, CommentsService commentService) {
//        this.userService = userService;
//        this.postService = postService;
//        this.commentService = commentService;
//
////    @Override
////    public void run(String... args) {
////         Create Users
////        User user1 = userService.createUser("john.doe@example.com", "John_Doe");
////        User user2 = userService.createUser("jane.doe@example.com", "Jane_Doe");
////
////         Create Posts
////        var post1 = postService.createPost(user1, "First Post", "This is the first post by John.");
////        var post2 = postService.createPost(user2, "Hello World", "Jane is saying hello!");
////
////         Create Comments
////        commentService.createComment(user2, post1, "Nice post, John!");
////        commentService.createComment(user1, post2, "Thank you, Jane!");
////    }
////}
