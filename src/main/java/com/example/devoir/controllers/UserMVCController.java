package com.example.devoir.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.devoir.models.*;
import com.example.devoir.service.UserService;

@Controller
@RequestMapping("/")
public class UserMVCController {
	@Autowired
	private UserService userService;
	
	
	//admin
	@GetMapping("admin")
	public String listeBugs(Model m){
		m.addAttribute("bugs",userService.getBugs());
		return "users/bugs";
	}
	
	@GetMapping("admin/affecter/{id}")
	public String AffecterBugs(Model m,@PathVariable int id) {
		User us = new User();
		m.addAttribute("bug",userService.getBugById(id));
		m.addAttribute("devs",userService.getDevs());
		m.addAttribute("user",us);
		return "users/affecter";
	}
	
	@PostMapping("admin/affecter/")
	public String enregistrer(@RequestParam(value = "idDev",required=false) int idDev ,@RequestParam(value="idBug",required=false) int id) {
		
		userService.affecter(id, idDev);
		return " redirect:/admin";
	}
	
	
	
	//client
	/*@GetMapping("client")
	public String listeTicketsCli(Model m,@PathVariable int id){
		m.addAttribute("tickets",userService.getTickets(id));
		return "users/bugs";
	}*/
	
	
	
	//developer
	/*@GetMapping("developer")
	public String listeTicketsDev(Model m,@PathVariable int id){
		User dev = 
		m.addAttribute("tickets",userService.getTickets(id));
		return "users/bugs";
	}*/
		
		
	
	

}
