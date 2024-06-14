package com.vchareyre.exo_spring_boot.models;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Table(name = "course", uniqueConstraints = @UniqueConstraint(columnNames = {"nom", "pays"}))
@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "pays")
    private String pays;

    @ManyToMany
    private Set<Pilote> pilotes;

    public Set<Pilote> getPilotes() {
        return pilotes;
    }

    public void setPilotes(Set<Pilote> pilotes) {
        this.pilotes = pilotes;
    }

    public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

}
