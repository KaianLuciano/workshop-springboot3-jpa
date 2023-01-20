package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entitites.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}	
