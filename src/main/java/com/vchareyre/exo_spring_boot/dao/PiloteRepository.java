package com.vchareyre.exo_spring_boot.dao;

import org.springframework.data.repository.CrudRepository;

import com.vchareyre.exo_spring_boot.models.Pilote;

public interface PiloteRepository extends CrudRepository<Pilote, Integer> {
}
