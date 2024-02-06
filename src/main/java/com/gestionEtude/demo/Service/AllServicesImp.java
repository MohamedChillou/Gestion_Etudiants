package com.gestionEtude.demo.Service;

import com.gestionEtude.demo.Entity.Module;
import com.gestionEtude.demo.Entity.Role;
import com.gestionEtude.demo.Entity.Student;
import com.gestionEtude.demo.Entity.Teacher;
import com.gestionEtude.demo.Repository.ModuleRepo;
import com.gestionEtude.demo.Repository.RoleRepo;
import com.gestionEtude.demo.Repository.StudentRepo;
import com.gestionEtude.demo.Repository.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AllServicesImp implements AllServices{
    @Autowired
    private StudentRepo studentRepo;
    @Autowired
    private RoleRepo roleRepo;
    @Autowired
    private TeacherRepo teacherRepo;
    @Autowired
    private ModuleRepo moduleRepo;
    @Override
    public Student addStudent(Student student) {
        return  studentRepo.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepo.deleteById(id);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepo.findAll();
    }

    @Override
    public Role addRole(Role role) {
        return roleRepo.save(role);
    }

    @Override
    public Role updateRole(Role role) {
        return roleRepo.save(role);
    }

    @Override
    public void deleteRole(Long id) {
        roleRepo.deleteById(id);
    }

    @Override
    public Student addRoleToStudent(Long idStudent, Long idRole) {
        Student student = studentRepo.findById(idStudent).get();
        Role role = roleRepo.findById(idRole).get();
        student.setRole(role);
        return studentRepo.save(student);
    }

    @Override
    public Teacher addTeacher(Teacher teacher) {
        return teacherRepo.save(teacher);
    }

    @Override
    public Teacher updateTeacher(Teacher teacher) {
        return teacherRepo.save(teacher);
    }

    @Override
    public List<Teacher> getAllTeacher() {
        return teacherRepo.findAll();
    }

    @Override
    public void deleteTeacher(Long id) {
        teacherRepo.deleteById(id);
    }

    @Override
    public Teacher addRoleToTeacher(Long idTeacher, Long idRole) {
        Teacher teacher = teacherRepo.findById(idTeacher).get();
        Role role = roleRepo.findById(idRole).get();
        teacher.setRole(role);
        return teacherRepo.save(teacher);
    }

    @Override
    public Module addModule(Module module) {
        return moduleRepo.save(module);
    }

    @Override
    public Module updateModule(Module module) {
        return moduleRepo.save(module);
    }

    @Override
    public List<Module> getAllModule() {
        return moduleRepo.findAll();
    }

    @Override
    public void deleteModule(Long id) {
        moduleRepo.deleteById(id);
    }

    @Override
    public void addModuleToStudent(Long idModule, Long idStudent) {
        Student student = studentRepo.findById(idStudent).get();
        Module module =  moduleRepo.findById(idModule).get();
        if (module.getStudentList() == null) {
            module.setStudentList(new ArrayList<>());
        }
        module.getStudentList().add(student);
        moduleRepo.save(module);
    }


}
