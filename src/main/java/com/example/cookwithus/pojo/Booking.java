package com.example.cookwithus.pojo;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.sql.Time;
import java.util.Date;

@Entity
@Table(name="booking")
public class Booking {
    @Id
    @Column(name = "BookingNr")
    private String nr;

    @Column(name = "BookingDate")
    private Date date;

    @Column(name = "BookingTime")
    private Time time;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name = "BClientName")
    private Client client;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name = "BLessonName")
    private Lesson lesson;

    @OneToOne
    @JsonBackReference
    @JoinColumn(name = "BookingSeatNr")
    private Seat seat;

    @OneToOne
    @JsonBackReference
    @JoinColumn(name = "BGiftProducts")
    private Gift gift;


    public Booking() {
    }

    public Booking(String nr, Date date, Time time) {
        this.nr = nr;
        this.date = date;
        this.time = time;
    }

    public String getNr() {
        return nr;
    }

    public void setNr(String nr) {
        this.nr = nr;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
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

    public Gift getGift() {
        return gift;
    }

    public void setGift(Gift gift) {
        this.gift = gift;
    }
}
