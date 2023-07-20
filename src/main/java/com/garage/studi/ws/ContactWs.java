package com.garage.studi.ws;

import com.garage.studi.pojo.Contact;
import com.garage.studi.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*")
@RequestMapping(value = "contact")
public class ContactWs {

    @Autowired
    private ContactService contactService;

    @PostMapping
    public void sendMailToGarage(@RequestBody Contact contact){
        this.contactService.sendMailToGarage(contact);

    }
}
