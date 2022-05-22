package com.example.devoir.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.devoir.models.Logiciel;

@Repository
public interface LogicielRepository  extends JpaRepository<Logiciel, Integer>{

}
