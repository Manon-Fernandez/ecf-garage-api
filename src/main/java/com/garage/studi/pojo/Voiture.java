package com.garage.studi.pojo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Voiture {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="voiture_id")
    private Long id;

    @Column(name="annee_mise_en_circulation")
    private Long annee_circulation;

    @Column(name="energie")
    private String Energie;

    private Long kilometre;

    private Float prix;

    private String description;


}
