package com.example.devoir.service;

import java.util.List;

import com.example.devoir.models.*;

public interface UserService {
	
	List<User> getUsers();

	List<User> getDevs();

	void ajouter(User user);
	
	void supprimer(int iduser);

	void modifier(User user);

	User getUser(int idUser);
	
	List<Bug> getBugs();
	
	Bug getBugById(int id);
	
	List<Ticket> getTickets(int idUser);
	
	void affecter(int idBug ,int idDev);
	
	
}
