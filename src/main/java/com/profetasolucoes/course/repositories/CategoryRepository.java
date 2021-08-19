package com.profetasolucoes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.profetasolucoes.course.entites.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

	
	
}
