package com.example.PartieBack.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Profil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProfil;
    private String NomProfil;

    @OneToMany( fetch = FetchType.EAGER)
    private Set<Fonction> fonctions;
}
