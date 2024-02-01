package com.gestionEtude.demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table
public class Student {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String LastName;
    private String telephone;
    private String password;
    private String codeAppoge;
    private String email;
    @ManyToMany(mappedBy = "studentList",fetch = FetchType.EAGER)
    private List<Module> moduleList = new ArrayList<>();
    @OneToMany(mappedBy = "student")
    private  List<Note> noteList = new ArrayList<>();

    @ManyToMany(mappedBy = "studentList",fetch = FetchType.EAGER)
    private List<Semester> semesterList = new ArrayList<>();

    @OneToOne
    private  Role role;


}