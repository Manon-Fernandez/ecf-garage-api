package com.garage.studi.pojo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Contact {

    private String title;

    private String name;

    private String firstname;

    private String mail;

    private String phone;

    private String description;


    public Contact(String title, String name, String firstname, String mail, String phone, String description) {
        this.title = title;
        this.name = name;
        this.firstname = firstname;
        this.mail = mail;
        this.phone = phone;
        this.description = description;
    }

    public Contact() {
    }
}
