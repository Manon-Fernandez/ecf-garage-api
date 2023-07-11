package com.garage.studi.ws;

import com.garage.studi.pojo.Option;
import com.garage.studi.service.VoitureOptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.garage.studi.service.VoitureOptionService;

import java.util.List;

@RestController
@RequestMapping(value = "option")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class VoitureOptionWs {

    @Autowired
    private VoitureOptionService optionService;


    @GetMapping(value = "/voiture/{voitureId}")
    public List<Option> getAllOptionByVoitureId(@PathVariable Long voitureId){
        return optionService.getAllOptionsByVoitureId(voitureId);
    }



}
