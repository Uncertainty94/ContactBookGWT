package ru.reksoft.lab.server.domain;

import javax.persistence.*;

/**
 * Created by mishanin on 19.04.2016.
 */
@Entity
@Table(name = "contacts_table")
public class Contact {
    private String name;
    private String surname;

    @Column(name = "tel_number")
    private String telNumber;

    private String mail;
    private String organization;
    private String position;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public Contact(){

    }

    public Contact(String name, String surname, String telNumber, String mail, String organization, String position) {
        this.name = name;
        this.surname = surname;
        this.telNumber = telNumber;
        this.mail = mail;
        this.organization = organization;
        this.position = position;
    }

    public Contact(int id, String name, String surname, String telNumber, String mail, String organization, String position) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.telNumber = telNumber;
        this.mail = mail;
        this.organization = organization;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public String getMail() {
        return mail;
    }

    public String getOrganization() {
        return organization;
    }

    public String getPosition() {
        return position;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        Contact anotherContact = (Contact) obj;
        return name.equals(anotherContact.getName()) &&
                surname.equals(anotherContact.getSurname()) &&
                telNumber.equals(anotherContact.getTelNumber()) &&
                mail.equals(anotherContact.getMail()) &&
                organization.equals(anotherContact.getOrganization()) &&
                position.equals(anotherContact.getPosition());
    }
}
