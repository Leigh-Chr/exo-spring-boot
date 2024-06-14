package com.vchareyre.exo_spring_boot.services.impl;

import java.text.MessageFormat;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vchareyre.exo_spring_boot.dao.CourseRepository;
import com.vchareyre.exo_spring_boot.models.Course;
import com.vchareyre.exo_spring_boot.models.Pilote;
import com.vchareyre.exo_spring_boot.models.Voiture;
import com.vchareyre.exo_spring_boot.services.CourseService;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courseRepository;

	@Override
	public Course findById(int id) {
		return courseRepository.findById(id).get();
	}

	@Override
	public Course save(Course course) {
		return courseRepository.save(course);
	}

	@Override
	public String start(int id, int vitesse) {
		Set<Pilote> pilotes = courseRepository.findById(id).get().getPilotes();

		String result = "";

		for (Pilote pilote : pilotes) {
			// Get all the voitures of the pilote
			Set<Voiture> voitures = pilote.getVoitures();
			for (Voiture voiture : voitures) {
				if (voiture.getVitesse() > vitesse) {
					// Push in the result
					result += MessageFormat.format("Le pilote {0} peut participer à la course avec sa voiture {1}\n",
							pilote.getNom(), voiture.getNom());
				}
			}
		}

		return !result.isEmpty() ? result : "Aucun pilote ne peut participer à la course avec sa voiture";
	}
}
