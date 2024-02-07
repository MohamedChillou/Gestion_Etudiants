package com.gestionEtude.demo.Service;

import com.gestionEtude.demo.Entity.*;
import com.gestionEtude.demo.Entity.Module;

import java.awt.*;
import java.util.List;


public interface AllServices {
    Student addStudent(Student student);
    Student updateStudent(Student student);
    void deleteStudent(Long id);
    List<Student> getAllStudent();
    Role addRole(Role role);
    Role updateRole(Role role);
    void deleteRole(Long id);
    Student addRoleToStudent(Long idStudent,Long idRole);
    Teacher addTeacher(Teacher teacher);
    Teacher updateTeacher(Teacher teacher);
    List<Teacher> getAllTeacher();
    void deleteTeacher(Long id);
    Teacher addRoleToTeacher(Long idTeacher,Long idRole);
    Module addModule(Module module);
    Module updateModule(Module module);
    List<Module> getAllModule();
    void deleteModule(Long id);
    void addModuleToStudent(Long idModule,Long idStudent);
    Module addModuleToTeacher(Long idModule, Long idTeacher);
    Semester addSemester(Semester semester);
    Semester updateSemester(Semester semester);
    List<Semester> getAllSemester();
    void deleteSemester(Long id);
    Module addModuleToSemester(Long idModule,Long idSemester);
    Semester addStudentToSemester(Long iStudent,Long idSemester);
    Semester addTeacherToSemester(Long idTeacher,Long idSemester);

}
