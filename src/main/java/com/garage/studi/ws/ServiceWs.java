package com.garage.studi.ws;


import com.garage.studi.pojo.ServiceGarage;
import com.garage.studi.service.GarageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public void createService(@RequestBody ServiceGarage serviceGarage){
        this.garageService.createService(serviceGarage);
    }

    @PutMapping("/{id}")
    public void updateService(@PathVariable("id") Long id,
                              @RequestBody ServiceGarage serviceGarage){
        this.garageService.updateService(id,serviceGarage);
    }

    @DeleteMapping("/{id}")
    public void deleteService(@PathVariable("id") Long id){
        this.garageService.deleteService(id);
    }
}
