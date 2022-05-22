package com.example.devoir.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.devoir.models.*;
import com.example.devoir.repositories.*;

@Service
public class BugServiceImpl implements BugService {
	@Autowired
	private BugRepository bugRepo;
	@Autowired
	private UrgenceRepository urgRepo;
	@Autowired
	private LogicielRepository logRepo;

	@Override
	public void ajouter(Bug bug) {
		bugRepo.save(bug);
	}

	@Override
	public List<Urgence> getUrgences() {
		return urgRepo.findAll();
	}

	@Override
	public List<Logiciel> getLogiciels() {
		return logRepo.findAll();
	}

}
