package com.garage.studi.ws;

import com.garage.studi.pojo.Horaire;
import com.garage.studi.service.HoraireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "horaire")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class HoraireWs {

    @Autowired
    private HoraireService horaireService;

    @GetMapping
    public List<Horaire> getAllhoraires(){
        List<Horaire> maList =  horaireService.getAllhoraires();
        return maList;
    }
}
