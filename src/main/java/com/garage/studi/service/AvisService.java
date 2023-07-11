package com.garage.studi.service;

import com.garage.studi.pojo.Avis;
import com.garage.studi.pojo.state.Status;
import com.garage.studi.repository.AvisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvisService {

    @Autowired
    private AvisRepository avisRepository;

    public List<Avis> getAllAvis() {
        return this.avisRepository.findAll();
    }

    public List<Avis> getAllAvisByStatus(Status status) {
        return this.avisRepository.findAllAvisByStatus(status);
    }
}
