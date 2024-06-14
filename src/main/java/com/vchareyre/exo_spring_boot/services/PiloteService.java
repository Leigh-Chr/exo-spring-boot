package com.vchareyre.exo_spring_boot.services;

import java.util.List;

import com.vchareyre.exo_spring_boot.models.Pilote;

public interface PiloteService {
	public List<Pilote> findAll();

	public Pilote create(Pilote pilote);

	Pilote delete(int id);
}
	