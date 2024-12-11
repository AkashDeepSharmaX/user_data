package com.example.softrelic.Service;
import com.example.softrelic.Repository.CommentsRepository;
import com.example.softrelic.domain.Comments;
import com.example.softrelic.domain.Post;
import com.example.softrelic.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentsService {
    private final CommentsRepository commentsRepository;
    public CommentsService(CommentsRepository commentsRepository){
        this. commentsRepository = commentsRepository;

    }


    public Comments createComment(User user, Post post, String text) {
        Comments comment = new Comments();
        comment.setUser(user);
        comment.setPost(post);
        comment.setText(text);
        return commentsRepository.save(comment);
    }


    }
