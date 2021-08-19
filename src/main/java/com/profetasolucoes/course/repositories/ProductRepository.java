package com.profetasolucoes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.profetasolucoes.course.entites.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	
	
}
