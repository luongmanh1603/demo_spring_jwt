package com.example.demo_spring_jwt.repo;

import com.example.demo_spring_jwt.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo  extends JpaRepository<Role, String> {
}
