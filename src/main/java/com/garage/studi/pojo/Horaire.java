package com.garage.studi.pojo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Horaire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_horaire")
    private Long id;

    private String jour;

    private String heure_ouverture;

    private String heure_fermeture;

}
