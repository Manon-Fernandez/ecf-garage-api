package com.garage.studi.pojo;

import com.garage.studi.pojo.state.Jour;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="horaire")
public class Horaire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_horaire")
    private Long id;

    @Enumerated(EnumType.STRING)
    private Jour jour;

    private String heure_ouverture;

    private String heure_fermeture;

}
