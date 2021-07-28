package com.profetasolucoes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.profetasolucoes.course.entites.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	
}
