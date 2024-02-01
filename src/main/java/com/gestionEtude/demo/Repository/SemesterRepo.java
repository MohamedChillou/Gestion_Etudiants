package com.gestionEtude.demo.Repository;

import com.gestionEtude.demo.Entity.Semester;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SemesterRepo extends JpaRepository<Semester,Long> {
}
