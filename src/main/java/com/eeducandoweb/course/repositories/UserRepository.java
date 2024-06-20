package com.eeducandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eeducandoweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	
	

}
