package com.gestionEtude.demo.Repository;

import com.gestionEtude.demo.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Long> {
}
