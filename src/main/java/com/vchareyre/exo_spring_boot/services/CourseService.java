package com.vchareyre.exo_spring_boot.services;

import com.vchareyre.exo_spring_boot.models.Course;

public interface CourseService {
	public Course findById(int id);

	public Course save(Course course);

    public String start(int id, int vitesse);
}
