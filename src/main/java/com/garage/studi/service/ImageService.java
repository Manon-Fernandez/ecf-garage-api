package com.garage.studi.service;

import com.garage.studi.pojo.Image;
import com.garage.studi.pojo.Voiture;
import com.garage.studi.repository.ImageRepository;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class ImageService {

    @Autowired
    private ImageRepository imageRepository;

    public Image saveImage(MultipartFile file, Voiture voiture,boolean isPrincipal) throws IOException {
        Image img = new Image();
        img.setPrincipal(isPrincipal);
        img.setImageBytes(Base64.encodeBase64URLSafe(file.getBytes()));
        img.setVoiture(voiture);
        return imageRepository.save(img);

    }
}
