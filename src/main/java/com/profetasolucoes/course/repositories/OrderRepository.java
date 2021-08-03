package com.profetasolucoes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.profetasolucoes.course.entites.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
