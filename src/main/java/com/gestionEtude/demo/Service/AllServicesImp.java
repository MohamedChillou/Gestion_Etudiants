package com.gestionEtude.demo.Service;

import com.gestionEtude.demo.Entity.*;
import com.gestionEtude.demo.Entity.Module;
import com.gestionEtude.demo.Repository.*;
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
    @Autowired
    private SemesterRepo semesterRepo;
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

    @Override
    public Module addModuleToTeacher(Long idModule, Long idTeacher) {
        Teacher teacher = teacherRepo.findById(idTeacher).get();
        Module module = moduleRepo.findById(idModule).get();
        module.setTeacher(teacher);
        return moduleRepo.save(module);
    }

    @Override
    public Semester addSemester(Semester semester) {
        return semesterRepo.save(semester);
    }

    @Override
    public Semester updateSemester(Semester semester) {
        return semesterRepo.save(semester);
    }

    @Override
    public List<Semester> getAllSemester() {
        return semesterRepo.findAll();
    }

    @Override
    public void deleteSemester(Long id) {
        semesterRepo.deleteById(id);
    }

    @Override
    public Module addModuleToSemester(Long idModule, Long idSemester) {
        Semester semester = semesterRepo.findById(idSemester).get();
        Module module = moduleRepo.findById(idModule).get();
        module.setSemester(semester);
        return moduleRepo.save(module);
    }

    @Override
    public Semester addStudentToSemester(Long iStudent, Long idSemester) {
        Semester semester = semesterRepo.findById(idSemester).get();
        Student student = studentRepo.findById(iStudent).get();
        if (semester.getStudentList() == null) {
            semester.setStudentList(new ArrayList<>());
        }
        semester.getStudentList().add(student);
        return semesterRepo.save(semester);
    }


}
