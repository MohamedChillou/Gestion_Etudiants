package com.gestionEtude.demo.Repository;

import com.gestionEtude.demo.Entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role,Long> {
}
