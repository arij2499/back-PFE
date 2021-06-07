package com.example.PartieBack.entities;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

import java.util.Set;

@Data
@Entity
public class Projet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long projet_id;
    private String intitule;
    private long cout;
    private boolean En_difficulte;
    private String stade;
    private Date date_ajout;
    private Date date_mise_ajour;
    private Date datedebut;
    private Date datefin;
    private String difficulte;


@OneToOne
   private PlanInitialFinancier pif;


    @OneToOne
     private PlanTravailFinancier ptf;

    @OneToMany( fetch = FetchType.EAGER)
    private Set<Facture> factures;
    

    @OneToOne
    private PlanPassationMarche PPM;

    @OneToOne
    private Marche marche;

    @OneToMany( fetch = FetchType.EAGER)
    private Set<AppelOffre> appelOffre;

    @OneToOne
    private RealisationPhysique RAP;
    @OneToOne
    private PlannficationPhysique PLP;
    @OneToOne
    private AjustementPhysique AJP;

}
