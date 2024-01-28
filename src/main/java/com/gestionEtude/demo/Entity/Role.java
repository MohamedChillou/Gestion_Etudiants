package com.gestionEtude.demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String role;
    @OneToOne(mappedBy = "role")
    private Teacher teacher;
    @OneToOne(mappedBy = "role")
    private  Student student;
}
