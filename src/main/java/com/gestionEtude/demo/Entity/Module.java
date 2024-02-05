package com.gestionEtude.demo.Entity;

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
public class Module {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name_module",unique = true)
    private String name;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Student> studentList = new ArrayList<>();
    @OneToMany(mappedBy = "module")
    private List<Note> noteList = new ArrayList<>();
    @ManyToOne
    private  Semester semester;
    @OneToMany(mappedBy = "module")
    private  List<TP> tpList = new ArrayList<>();
    @OneToMany
    private  List<Course> courseList = new ArrayList<>();
    @ManyToOne
    private Teacher teacher ;
}