package com.example.cookwithus.pojo.entity;

import jakarta.persistence.*;

@Entity
@Table(
        name = "client"
)
public class Client {

    @Id
    @Column(
            name = "client_name"
    )
    private String name;
    @Column(
            name = "client_surname"
    )
    private String surname;


    @Column(
            name = "client_email"
    )
    private String email;

    public Client() {
        this.name = "Unknown";
        this.surname = "Unknown";
        this.email = "Unknown";
    }

    public Client(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\''+
                '}';
    }
}
