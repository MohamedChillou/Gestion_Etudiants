package com.gestionEtude.demo.Entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
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
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Teacher {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String LastName;
    private String telephone;
    private String password;
    private String codeProf;
    private String email;
    @OneToMany(mappedBy = "teacher")
    private List<Module> moduleList = new ArrayList<>();
    @ManyToMany(fetch = FetchType.EAGER , mappedBy = "teacherList")
    private List<Semester> semesterList =new ArrayList<>();
    @OneToOne
    private  Role role;

}