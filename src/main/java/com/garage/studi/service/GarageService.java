package com.garage.studi.service;

import com.garage.studi.pojo.ServiceGarage;
import com.garage.studi.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GarageService {

    @Autowired
    private ServiceRepository serviceRepository;

    public List<ServiceGarage> getAllServices(){
        return this.serviceRepository.findAll();
    }
}
