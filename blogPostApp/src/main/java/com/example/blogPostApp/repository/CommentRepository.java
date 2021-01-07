package com.example.blogPostApp.repository;

import com.example.blogPostApp.model.Comment;
import com.example.blogPostApp.model.Post;
import com.example.blogPostApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}
