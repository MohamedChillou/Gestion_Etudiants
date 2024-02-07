package com.gestionEtude.demo.Entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
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
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Student {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String LastName;
    private String telephone;
    private String password;
    private String codeAppoge;
    private String email;

    @ManyToMany(mappedBy = "studentList", fetch = FetchType.EAGER)
    private List<Module> moduleList = new ArrayList<>();

    @OneToMany(mappedBy = "student")
    private List<Note> noteList = new ArrayList<>();

    @ManyToMany(mappedBy = "studentList", fetch = FetchType.EAGER)
    private List<Semester> semesterList = new ArrayList<>();

    @OneToOne
    private Role role;


}