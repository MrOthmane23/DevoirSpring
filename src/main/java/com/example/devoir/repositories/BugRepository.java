package com.example.devoir.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.devoir.models.Bug;


@Repository
public interface BugRepository  extends JpaRepository<Bug, Integer>{
	
	@Query("select b from Bug b where b.attribue =:att")
	List<Bug> getBugsNA(@Param("att") Boolean att);

}
