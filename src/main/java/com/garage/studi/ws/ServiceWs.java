package com.garage.studi.ws;


import com.garage.studi.pojo.ServiceGarage;
import com.garage.studi.service.GarageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "service")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class ServiceWs {

    @Autowired
    private GarageService garageService;

    @GetMapping
    public List<ServiceGarage> getAllServices(){
        return this.garageService.getAllServices();
    }
}
