package com.vchareyre.exo_spring_boot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vchareyre.exo_spring_boot.models.Voiture;
import com.vchareyre.exo_spring_boot.services.VoitureService;

@RestController
public class VoitureController {

	@Autowired
	private VoitureService voitureService;

	@GetMapping("/voitures")
	public List<Voiture> findAll() {
		return voitureService.findAll();
	}

	@PostMapping("/voitures")
	public Voiture create(@RequestBody Voiture voiture) {
		return voitureService.create(voiture);
	}
}
