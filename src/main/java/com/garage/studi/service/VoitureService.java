package com.garage.studi.service;

import com.garage.studi.pojo.Image;
import com.garage.studi.pojo.Voiture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.garage.studi.repository.VoitureRepository;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class VoitureService {

    @Autowired
    private VoitureRepository voitureRepository;

    @Autowired
    private ImageService imageService;

    public List<Voiture> getAllVoitures() {
        return this.voitureRepository.findAll();
    }

    public Voiture getVoitureById(Long id) {
        Optional<Voiture> voitures = this.voitureRepository.findById(id);
        Voiture voiture = null;
        if (voitures.isPresent()){
           voiture = voitures.get();
        }
        return voiture;
    }


    public void saveVoitureWithImage(Voiture car, MultipartFile file) throws IOException {
        //creation de la voiture
        this.voitureRepository.save(car);

        Image img = imageService.saveImage(file,car,true); // retourner l'ImageModel après la sauvegarde
        Set<Image> images = car.getImages();
        images.add(img);// affecter l'image à la voiture
        voitureRepository.save(car);
    }

    public void saveImageToVoiture(Long id,MultipartFile file) throws IOException {
        Optional<Voiture> voitureOptional = this.voitureRepository.findById(id);
        if(voitureOptional.isPresent()){
            Voiture voiture = voitureOptional.get();
            Image img = imageService.saveImage(file,voiture,false);
            Set<Image> images = voiture.getImages();
            images.add(img);// affecter l'image à la voiture
            voitureRepository.save(voiture);
        }
    }

    public void deleteVoitureById(Long id) {
        this.voitureRepository.deleteById(id);
    }

    public void saveVoitureWithoutImage(Voiture voiture) {
        this.voitureRepository.save(voiture);
    }

    public void updateVoitureById(Long id, Voiture voiture) {
        Voiture oldVoiture = this.getVoitureById(id);
        if(oldVoiture != null){
            if(oldVoiture.getId().equals(voiture.getId())) {
                oldVoiture.setKilometre(voiture.getKilometre());
                oldVoiture.setDescription(voiture.getDescription());
                oldVoiture.setDenomination(voiture.getDenomination());
                oldVoiture.setAnnee_circulation(voiture.getAnnee_circulation());
                oldVoiture.setEnergie(voiture.getEnergie());
                oldVoiture.setPrix(oldVoiture.getPrix());
                this.voitureRepository.save(oldVoiture);
            }
        }
    }
}
