package com.fayaz.FullStack_backend.repository;

import com.fayaz.FullStack_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}