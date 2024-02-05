package com.gestionEtude.demo;

import com.gestionEtude.demo.Entity.Module;
import com.gestionEtude.demo.Entity.Role;
import com.gestionEtude.demo.Entity.Student;
import com.gestionEtude.demo.Repository.ModuleRepo;
import com.gestionEtude.demo.Repository.RoleRepo;
import com.gestionEtude.demo.Repository.StudentRepo;
import com.gestionEtude.demo.Service.AllServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class GestionEtudeApplication implements CommandLineRunner {
@Autowired
private StudentRepo studentRepo;
@Autowired
private RoleRepo roleRepo;
@Autowired
private ModuleRepo moduleRepo;
@Autowired
private AllServices services ;

	public static void main(String[] args) {
		SpringApplication.run(GestionEtudeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {





	}
}
