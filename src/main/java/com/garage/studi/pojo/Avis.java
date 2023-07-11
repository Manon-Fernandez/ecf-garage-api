package com.garage.studi.pojo;

import lombok.Getter;
import lombok.Setter;
import com.garage.studi.pojo.state.Status;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="Avis")
public class Avis {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "avis_id")
    private Long id;

    private String commentaire;

    private String nom;

    private String note;

    @Enumerated(EnumType.STRING)
    private Status status;

}
