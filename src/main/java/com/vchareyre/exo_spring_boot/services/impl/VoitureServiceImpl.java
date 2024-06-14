package com.vchareyre.exo_spring_boot.services.impl;

import com.vchareyre.exo_spring_boot.dao.VoitureRepository;
import com.vchareyre.exo_spring_boot.models.Voiture;
import com.vchareyre.exo_spring_boot.services.VoitureService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoitureServiceImpl implements VoitureService {
	
	@Autowired
	private VoitureRepository voitureRepository;
	
	@Override
	public List<Voiture> findAll() {
		return (List<Voiture>) voitureRepository.findAll();
	}

	@Override
	public Voiture create(Voiture voiture) {
		return voitureRepository.save(voiture);
	}
}
