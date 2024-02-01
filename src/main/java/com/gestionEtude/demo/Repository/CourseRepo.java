package com.gestionEtude.demo.Repository;

import com.gestionEtude.demo.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course,Long> {
}
