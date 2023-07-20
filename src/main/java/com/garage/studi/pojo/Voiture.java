package com.garage.studi.pojo;

import com.garage.studi.pojo.state.EnergieEnum;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name="voiture")
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

    @OneToMany(mappedBy = "maVoiture", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Option> options;

    public boolean equals(Voiture voiture){
        return Objects.equals(this.id, voiture.getId()) &&
                this.denomination.equals(voiture.getDenomination()) &&
                this.energie.equals(voiture.getEnergie()) && Objects.equals(this.annee_circulation, voiture.getAnnee_circulation()) && Objects.equals(this.kilometre, voiture.getKilometre()) && Objects.equals(this.prix, voiture.getPrix()) && this.description.equals(voiture.getDescription());
    }

    @Override
    public String toString(){
        return "Voiture{" +
                "id=" + id +
                ", denomination='" + denomination + '\'' +
                ", energie='" + energie + '\'' +
                ", annee_circulation='" + annee_circulation + '\'' +
                ", kilometre='" + kilometre + '\'' +
                ", prix='" + prix + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

}
