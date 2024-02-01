package com.gestionEtude.demo.Repository;

import com.gestionEtude.demo.Entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepo extends JpaRepository<Teacher,Long> {
}
