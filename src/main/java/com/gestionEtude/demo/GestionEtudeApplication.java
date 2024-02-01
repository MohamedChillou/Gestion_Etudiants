package com.gestionEtude.demo;

import com.gestionEtude.demo.Entity.Module;
import com.gestionEtude.demo.Entity.Role;
import com.gestionEtude.demo.Entity.Student;
import com.gestionEtude.demo.Repository.ModuleRepo;
import com.gestionEtude.demo.Repository.RoleRepo;
import com.gestionEtude.demo.Repository.StudentRepo;
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
	public static void main(String[] args) {
		SpringApplication.run(GestionEtudeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		Student student =  Student.builder()
				.firstName("Chillou")
				.codeAppoge("A2435F34")
				.LastName("Mohamed")
				.password("HayHay")
				.telephone("0666818992")
				.email("chilloumohamed@gmail.com")
				.build();
		student = studentRepo.save(student);

		Role role = Role.builder()
				.role("Student")
				.build();
		role = roleRepo.save(role);
		student.setRole(role);
		studentRepo.save(student);
		Module module = Module.builder()
				.name("JEE")
				.build();
		module = moduleRepo.save(module);
		if (module.getStudentList() == null) {
			module.setStudentList(new ArrayList<>());
		}
		module.getStudentList().add(student);
		moduleRepo.save(module);
		 */


	}
}
