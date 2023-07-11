package com.garage.studi.pojo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "service")
public class ServiceGarage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long service_id;

    private String nom;

    private String description;

    private String image;


}
