package com.vchareyre.exo_spring_boot.dao;

import org.springframework.data.repository.CrudRepository;

import com.vchareyre.exo_spring_boot.models.Course;

public interface CourseRepository extends CrudRepository<Course, Integer> {

}
