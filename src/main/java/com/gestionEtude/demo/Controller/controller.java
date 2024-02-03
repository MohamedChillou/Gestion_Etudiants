package com.gestionEtude.demo.Controller;

import com.gestionEtude.demo.Entity.Student;
import com.gestionEtude.demo.Service.AllServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/application")
public class controller {
    @Autowired
    private AllServices services;
    @PostMapping("/ajouteEtudiant")
    public Student addStudent(@RequestBody Student student){
        return services.addStudent(student);
    }
    @PutMapping("/modifierEtudiant")
    public Student updateStudent(@RequestBody Student student){
        return services.updateStudent(student);
    }

    @DeleteMapping("/supprimerEtudiant/{id}")
    public void deleteStudent(@PathVariable Long id){
        services.deleteStudent(id);
    }

}
