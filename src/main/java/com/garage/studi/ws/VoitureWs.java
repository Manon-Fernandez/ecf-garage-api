package com.garage.studi.ws;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.garage.studi.pojo.Voiture;
import com.garage.studi.service.VoitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

import java.io.IOException;
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

    @GetMapping("/{id}")
    public Voiture getVoitureById(@PathVariable("id") Long id){
        return voitureService.getVoitureById(id);
    }

    @PostMapping
    public void createVoiture(@RequestBody Voiture voiture){
        voitureService.saveVoitureWithoutImage(voiture);
    }

    @DeleteMapping("/{id}")
    public void deleteVoitureById(@PathVariable("id") Long id){
        voitureService.deleteVoitureById(id);
    }

    @PutMapping("/{id}")
    public void updateVoitureById(@PathVariable("id") Long id,
                                  @RequestBody Voiture voiture){
        voitureService.updateVoitureById(id,voiture);
    }

    @PostMapping("/image/")
    public void uploadCarWithImage(@RequestParam("car") String voitureString, @RequestParam("imageFile") MultipartFile file) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Voiture car = mapper.readValue(voitureString, Voiture.class);
            voitureService.saveVoitureWithImage(car, file);
        } catch (IOException e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,
                    "Erreur lors de l'upload de l'image", e);
        }
    }

    @PostMapping("/image/{voiture_id}")
    public void addImageToVoiture(@PathVariable("voiture_id") Long id,
                                  @RequestParam("imageFile") MultipartFile file){
        try {
            voitureService.saveImageToVoiture(id,file);
        } catch (IOException e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,
                    "Erreur lors de l'upload de l'image", e);
        }
    }
}
