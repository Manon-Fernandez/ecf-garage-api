package com.garage.studi.pojo.embeddable;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
public class VoitureOptionId implements Serializable {

    private Long voiture_id;
    private Long option_id;
}
