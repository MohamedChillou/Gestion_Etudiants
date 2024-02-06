package com.gestionEtude.demo.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table
public class Teacher {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String LastName;
    private String telephone;
    private String password;
    private String codeProf;
    private String email;
    @JsonIgnoreProperties("teacher")
    @OneToMany(mappedBy = "teacher")
    private List<Module> moduleList = new ArrayList<>();
    @ManyToMany(fetch = FetchType.EAGER , mappedBy = "teacherList")
    private List<Semester> semesterList =new ArrayList<>();
    @OneToOne
    private  Role role;

}