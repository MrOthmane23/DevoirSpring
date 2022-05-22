package com.example.devoir.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.devoir.models.Logiciel;
import com.example.devoir.repositories.LogicielRepository;

@Service
public class LogicielServiceImpl implements LogicielService{

	@Autowired
	private LogicielRepository logRepo;
	
	@Override
	public void ajouter(Logiciel log) {
		logRepo.save(log);
	}

}
