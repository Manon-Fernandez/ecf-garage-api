package com.garage.studi.pojo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="option")
public class Option {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="option_id")
    private Long id;

    private String nom;

    private String description;


}
