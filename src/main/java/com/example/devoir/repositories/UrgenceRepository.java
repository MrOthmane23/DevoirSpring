package com.example.devoir.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.devoir.models.Urgence;


@Repository
public interface UrgenceRepository  extends JpaRepository<Urgence, Integer>{

}
