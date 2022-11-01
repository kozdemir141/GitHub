package com.project.testApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.testApp.models.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByEmail(String email);
}
