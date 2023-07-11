package com.garage.studi.pojo;

import com.garage.studi.pojo.embeddable.VoitureOptionId;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
public class VoitureOption {

    @Id
    private VoitureOptionId voitureOptionId;



}
