package com.garage.studi.ws;

import com.garage.studi.pojo.Voiture;
import com.garage.studi.service.VoitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "voiture")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class VoitureWs {

    @Autowired
    private VoitureService voitureService;

    @GetMapping
    public List<Voiture> getAllVoitures(){
        List<Voiture> maList =  voitureService.getAllVoitures();
        return maList;
    }

}
