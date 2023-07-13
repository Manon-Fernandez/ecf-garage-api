package com.garage.studi.pojo;

import com.garage.studi.pojo.state.EnergieEnum;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class Voiture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="voiture_id")
    private Long id;

    @Column(name="annee_mise_en_circulation")
    private Long annee_circulation;

    @Enumerated(EnumType.STRING)
    private EnergieEnum energie;

    private Long kilometre;

    private Float prix;

    private String description;

    private String denomination;

    @OneToMany(mappedBy = "voiture", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Image> images = new HashSet<>();

    @OneToMany(mappedBy = "voiture", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Option> options = new HashSet<>();

}
