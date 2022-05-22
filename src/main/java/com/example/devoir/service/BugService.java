package com.example.devoir.service;

import java.util.List;

import com.example.devoir.models.*;

public interface BugService {
	void ajouter(Bug bug);
	
	List<Urgence> getUrgences();
	List<Logiciel> getLogiciels();
}
