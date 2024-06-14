package com.vchareyre.exo_spring_boot.dao;

import org.springframework.data.repository.CrudRepository;

import com.vchareyre.exo_spring_boot.models.Voiture;

public interface VoitureRepository extends CrudRepository<Voiture, Integer> {

}
