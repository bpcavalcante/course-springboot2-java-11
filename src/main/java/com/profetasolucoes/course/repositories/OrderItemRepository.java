package com.profetasolucoes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.profetasolucoes.course.entites.OrderItem;
import com.profetasolucoes.course.entites.User;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	
	
}
