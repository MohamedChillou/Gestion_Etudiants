package com.gestionEtude.demo.Repository;

import com.gestionEtude.demo.Entity.Module;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModuleRepo extends JpaRepository<Module,Long> {
}
