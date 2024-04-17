package com.example.cookwithus.pojo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity
@Table(
        name = "gift"
)
public class Gift {

    @Id
    @Column(
            name = "products"
    )
    private String products;



    @OneToOne
    @JsonBackReference
    @JoinColumn(name = "g_booking_nr")
    private Booking booking;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(
            name = "g_client_name"
    )
    private Client client;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(
            name = "g_lesson_name"
    )
    private Lesson lesson;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(
            name = "g_seat_nr"
    )
    private Seat seat;



    public Gift(String products) {
        this.products = products;
    }

    public Gift() {

    }


    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }
}
