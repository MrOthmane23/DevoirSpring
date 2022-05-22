package com.example.devoir.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.devoir.models.Ticket;
import com.example.devoir.models.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Integer>{

	@Query("Select u from User u where u.role.nom = 'developer'")
	List<User> getDevs();
	
	User findByUsername(String name);
}
