package com.project.testApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.testApp.models.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
