package com.garage.studi.service;

import com.garage.studi.pojo.Voiture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.garage.studi.repository.VoitureRepository;

import java.util.List;

@Service
public class VoitureService {

    @Autowired
    private VoitureRepository voitureRepository;

    public List<Voiture> getAllVoitures() {
        return this.voitureRepository.findAll();
    }
}
