package com.example.cookwithus.pojo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(
        name = "lesson"
)
public class Lesson {
    @Id
    @Column(
            name = "lesson_name"
    )
    private String name;
    @Column(
            name = "lesson_category"
    )
    private String category;

    @OneToMany(
            mappedBy = "lesson"
    )

    @JsonBackReference
    private List<Booking> bookingList;

    @OneToMany(
            mappedBy = "lesson"
    )

    @JsonBackReference
    private List<Realization> realizationsList;


    @OneToMany(mappedBy = "lesson")
    @JsonBackReference
    private List<Gift> gift;



    public Lesson() {
        this.name = "Unknown";
        this.category = "Unknown";
    }

    public Lesson(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public List<Gift> getGift() {
        return gift;
    }

    public void setGift(List<Gift> gift) {
        this.gift = gift;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<Booking> getBookingList() {
        return bookingList;
    }

    public void setBookingList(List<Booking> bookingList) {
        this.bookingList = bookingList;
    }

    public List<Realization> getRealizationsList() {
        return this.realizationsList;
    }

    public void setRealizationsList(List<Realization> realizationsList) {
        this.realizationsList = realizationsList;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
