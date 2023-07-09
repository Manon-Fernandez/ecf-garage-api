package com.garage.studi.service;

import com.garage.studi.pojo.Horaire;
import com.garage.studi.repository.HoraireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HoraireService {


    @Autowired
    private HoraireRepository horaireRepository;

    public List<Horaire> getAllhoraires() {
        return this.horaireRepository.findAll();
    }
}
