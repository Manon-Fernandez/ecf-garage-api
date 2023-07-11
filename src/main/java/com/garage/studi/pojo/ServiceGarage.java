package com.garage.studi.pojo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class ServiceGarage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="service_id")
    private Long id;

    private String nom;

    private String description;

    private String image;


}
