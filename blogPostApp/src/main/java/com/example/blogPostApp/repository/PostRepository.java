package com.example.blogPostApp.repository;

import com.example.blogPostApp.model.Post;
import com.example.blogPostApp.model.Subreddit;
import com.example.blogPostApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}

