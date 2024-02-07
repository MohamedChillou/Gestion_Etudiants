package com.gestionEtude.demo.Controller;

import com.gestionEtude.demo.Entity.*;
import com.gestionEtude.demo.Entity.Module;
import com.gestionEtude.demo.Service.AllServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/application")
public class controller {
    @Autowired
    private AllServices services;

    @GetMapping("/Etudiants")
    public List<Student> getAllStudent(){
        return services.getAllStudent();
    }

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

    @PostMapping("/AjouteRole")
    public Role addRole(@RequestBody Role role){
        return services.addRole(role);
    }

    @PutMapping("/ModifierRole")
    public Role updateRole(@RequestBody Role role){
        return services.updateRole(role);
    }
    @DeleteMapping("/supprimerRole/{id}")
    public void deleteRole(@PathVariable Long id){
        services.deleteRole(id);
    }
    @PostMapping("/ajouteRoleEtudiant")
    public Student addRoleToStudent(@RequestBody Map<String,Long> infos){
        return services.addRoleToStudent(infos.get("idStudent"),infos.get("idRole"));
    }
    @GetMapping("/Ensgs")
    public List<Teacher> getAllTeacher(){
        return services.getAllTeacher();
    }

    @PostMapping("/AjouteEnsg")
    public Teacher addTeacher(@RequestBody Teacher teacher){
        return services.addTeacher(teacher);
    }
    @PutMapping("/ModifierEnsg")
    public Teacher updateTeacher(@RequestBody Teacher teacher){
        return  services.updateTeacher(teacher);
    }
    @DeleteMapping("/supprimerEnsg/{id}")
    public void deleteTeacher(@PathVariable Long id){
        services.deleteTeacher(id);
    }

    @PostMapping("/ajouteRoleEnsg")
    public Teacher addRoleToTeacher(@RequestBody Map<String,Long> infos){
        return services.addRoleToTeacher(infos.get("idEnsg"),infos.get("idRole"));
    }
    @GetMapping("/Modules")
    public List<Module> getAllModule(){
        return services.getAllModule();
    }
    @PostMapping("/ajouteModule")
    public Module addModel(@RequestBody Module module){
        return services.addModule(module);
    }
    @PutMapping("/modifierModule")
    public Module updateModule(@RequestBody Module module){
        return services.updateModule(module);
    }

    @DeleteMapping("/supprimerModule/{id}")
    public void deleteModule(@PathVariable  Long id){
        services.deleteModule(id);
    }

    @PostMapping("/ajouteModuleEtudiant")
    public void addModuleToStudent(@RequestBody Map<String,Long> infos){
        services.addModuleToStudent(infos.get("idModule"),infos.get("idStudent") );
    }

    @PostMapping("/ajouteModuleTeacher")
    public Module addModuleToTeacher(@RequestBody Map<String,Long> infos){
       return services.addModuleToTeacher(infos.get("idModule"),infos.get("idTeacher") );
    }

    @GetMapping("/Semesters")
    public List<Semester> getAllSemester(){
        return services.getAllSemester();
    }

    @PostMapping("/ajouteSemester")
    public Semester addSemester(@RequestBody Semester semester){
        return services.addSemester(semester);
    }

    @PutMapping("/modifierSemester")
    public  Semester updateSemester(Semester semester){
        return services.updateSemester(semester);
    }

    @DeleteMapping("/supprimerSemester/{id}")
    public void deleteSemester(@PathVariable Long id){
        services.deleteSemester(id);
    }

    @PostMapping("/ajouteModuleSemester")
    public  Module addModuleToSemester(@RequestBody Map<String,Long> infos){
        return services.addModuleToSemester(infos.get("idModule"),infos.get("idSemester"));
    }
    @PostMapping("/ajouteSemesterStudent")
    public Semester addStudentToSemester(@RequestBody Map<String,Long> infos){
        return services.addStudentToSemester(infos.get("iStudent"),infos.get("idSemester"));
    }

    @PostMapping("/ajouteSemesterTeacher")
    public Semester addTeacherToSemester(@RequestBody Map<String,Long> infos){
        return services.addStudentToSemester(infos.get("idTeacher"),infos.get("idSemester"));
    }
}
