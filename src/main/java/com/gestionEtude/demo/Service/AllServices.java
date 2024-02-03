package com.gestionEtude.demo.Service;

import com.gestionEtude.demo.Entity.Student;

public interface AllServices {
    Student addStudent(Student student);
    Student updateStudent(Student student);
    void deleteStudent(Long id);
}
