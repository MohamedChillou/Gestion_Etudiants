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
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")

public class Semester {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name_semester")
    private String name;
    @OneToMany(mappedBy = "semester")
    List<Module> moduleList = new ArrayList<>();
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Student> studentList = new ArrayList<>();

    @ManyToMany(fetch = FetchType.EAGER)
    private  List<Teacher> teacherList =new ArrayList<>();


}