package com.example.blogPostApp.repository;

import com.example.blogPostApp.model.Post;
import com.example.blogPostApp.model.User;
import com.example.blogPostApp.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}

