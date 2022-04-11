package com.sparta.miniproject02.repository;

import com.sparta.miniproject02.domain.Likes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LikesRepository extends JpaRepository<Likes, Long> {
    Optional<Likes> findByPostsIdAndLikeUserId(Long postId, Long likeUserId);
}
