package com.eder.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eder.coursespring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
