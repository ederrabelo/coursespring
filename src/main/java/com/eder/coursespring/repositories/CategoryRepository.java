package com.eder.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eder.coursespring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}