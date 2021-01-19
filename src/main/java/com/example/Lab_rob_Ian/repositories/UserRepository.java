package com.example.Lab_rob_Ian.repositories;

import com.example.Lab_rob_Ian.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
