package com.alvaro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alvaro.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
