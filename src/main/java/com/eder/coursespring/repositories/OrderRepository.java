package com.eder.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eder.coursespring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
