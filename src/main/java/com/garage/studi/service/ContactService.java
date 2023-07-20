package com.garage.studi.service;

import com.garage.studi.pojo.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Value("${spring.mail.username}")
    private String mailGarage;

    public void sendMailToGarage(Contact contact) {
        SimpleMailMessage mailMessage = new SimpleMailMessage();

        mailMessage.setTo(mailGarage);
        mailMessage.setSubject(contact.getTitle());
        mailMessage.setFrom(mailGarage);
        mailMessage.setReplyTo(mailGarage);
        mailMessage.setText("Vous avez été contacté par " + contact.getFirstname() + " " + contact.getName() + ", disponible au numero de GSM " + contact.getPhone()
         + ", et par mail " + contact.getMail() + ", pour le motif suivant : " + contact.getDescription());
        javaMailSender.send(mailMessage);

    }
}
