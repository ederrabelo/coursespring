package com.eder.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eder.coursespring.entities.OrderItem;
import com.eder.coursespring.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
