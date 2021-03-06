package com.example.PartieBack.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Marche {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long marche_id;
    private String nom_fournisseur;

}
