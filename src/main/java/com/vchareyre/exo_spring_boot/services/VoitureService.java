package com.vchareyre.exo_spring_boot.services;

import java.util.List;

import com.vchareyre.exo_spring_boot.models.Voiture;

public interface VoitureService {
	public List<Voiture> findAll();

	public Voiture create(Voiture voiture);
}
