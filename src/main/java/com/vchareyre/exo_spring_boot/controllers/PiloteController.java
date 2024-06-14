package com.vchareyre.exo_spring_boot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vchareyre.exo_spring_boot.models.Pilote;
import com.vchareyre.exo_spring_boot.services.PiloteService;

@RestController
public class PiloteController {
	
	@Autowired
	private PiloteService piloteService;
	
	@GetMapping("/pilotes")
	public List<Pilote> findAll() {
		return piloteService.findAll();
	}
	
	@PostMapping("/pilotes")
	public Pilote create(@RequestBody Pilote pilote) {
		return piloteService.create(pilote);
	}
	
	@DeleteMapping("/pilotes/{id}")
	public Pilote delete(@PathVariable int id) {
		return piloteService.delete(id);
	}
}
