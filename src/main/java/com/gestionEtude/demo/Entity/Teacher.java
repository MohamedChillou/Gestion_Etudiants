package com.gestionEtude.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Teacher {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String firstName;
    String LastName;
    String telephone;
    String password;
    String codeProf;
    String email;
}
