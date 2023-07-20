package com.garage.studi.service;

import com.garage.studi.pojo.Avis;
import com.garage.studi.pojo.state.Status;
import com.garage.studi.repository.AvisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public void createAvis(Avis unAvis){
        unAvis.setStatus(Status.EN_ATTENTE);
        this.avisRepository.save(unAvis);
    }

    public void updateStatusAvis(Avis unAvis, Status status){
        if(unAvis.getId() != null) {
            Long id = unAvis.getId();
            Optional<Avis> avis = this.avisRepository.findById(id);
            if (avis.isPresent()) {
                Avis monAvis = avis.get();
                monAvis.setStatus(status);
                this.avisRepository.save(monAvis);
            }
        }
    }

    public void deleteAvisById(Long id) {
        this.avisRepository.deleteById(id);
    }

    public void createAvisWithStatus(Avis unAvis, Status status) {
        if(unAvis != null){
            if(unAvis.getStatus() != null){
                if (unAvis.getStatus().equals(status)) {
                    this.avisRepository.save(unAvis);
                }
                else{
                    unAvis.setStatus(status);
                    this.avisRepository.save(unAvis);
                }
            }else {
                unAvis.setStatus(status);
                this.avisRepository.save(unAvis);
            }
        }
    }
}
