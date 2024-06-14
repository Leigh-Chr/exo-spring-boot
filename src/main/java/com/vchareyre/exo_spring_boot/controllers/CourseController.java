package com.vchareyre.exo_spring_boot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vchareyre.exo_spring_boot.models.Course;
import com.vchareyre.exo_spring_boot.services.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/course/{id}")
	public Course findById(@PathVariable int id) {
		return courseService.findById(id);
	}

	@PostMapping("/course")
	public Course save(@RequestBody Course course) {
		return courseService.save(course);
	}

	// Démarrer la course (/course/id/vitesse/start)
	@PostMapping("/course/{id}/{vitesse}/start")
	public String start(@PathVariable int id, @PathVariable int vitesse) {
		return courseService.start(id, vitesse);
	}
}
