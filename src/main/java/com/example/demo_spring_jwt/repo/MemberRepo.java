package com.example.demo_spring_jwt.repo;

import com.example.demo_spring_jwt.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepo  extends JpaRepository<Member, Integer> {
}
