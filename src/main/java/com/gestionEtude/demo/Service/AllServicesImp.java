package com.gestionEtude.demo.Service;

import com.gestionEtude.demo.Entity.Student;
import com.gestionEtude.demo.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AllServicesImp implements  AllServices{
    @Autowired
    private StudentRepo studentRepo;
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
}
