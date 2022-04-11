package com.sparta.miniproject02.repository;

import com.sparta.miniproject02.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByUsername(String username);
    Optional<User> findByKakao_id(Long kakao_id);
}
