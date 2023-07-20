package com.garage.studi.service;

import com.garage.studi.pojo.ServiceGarage;
import com.garage.studi.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class GarageService {

    @Autowired
    private ServiceRepository serviceRepository;

    public List<ServiceGarage> getAllServices(){
        return this.serviceRepository.findAll();
    }

    @PostMapping
    public void createService(@RequestBody ServiceGarage serviceGarage){
        this.serviceRepository.save(serviceGarage);
    }

    public void updateService(Long id, ServiceGarage serviceGarage) {
        Optional<ServiceGarage> serviceOptional = this.serviceRepository.findById(id);
        if(serviceOptional.isPresent()){
            ServiceGarage serviceToSave = serviceOptional.get();
            serviceToSave.setNom(serviceGarage.getNom());
            serviceToSave.setDescription(serviceGarage.getDescription());
            this.serviceRepository.save(serviceToSave);
        }

    }

    public void deleteService(Long id) {
        this.serviceRepository.deleteById(id);
    }
}
