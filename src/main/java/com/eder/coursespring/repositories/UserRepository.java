package com.eder.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eder.coursespring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
