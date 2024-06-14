package com.vchareyre.exo_spring_boot.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vchareyre.exo_spring_boot.dao.PiloteRepository;
import com.vchareyre.exo_spring_boot.models.Pilote;
import com.vchareyre.exo_spring_boot.services.PiloteService;

@Service
public class PiloteServiceImpl implements PiloteService {
	
	@Autowired
	private PiloteRepository piloteRepository;
	
	@Override
	public List<Pilote> findAll() {
		return (List<Pilote>) piloteRepository.findAll();
	}
	
	@Override
	public Pilote create(Pilote pilote) {
		return piloteRepository.save(pilote);
	}
	
	@Override
	public Pilote delete(int id) {
		Pilote pilote = piloteRepository.findById(id).get();
		piloteRepository.deleteById(id);
		return pilote;
	}
}
