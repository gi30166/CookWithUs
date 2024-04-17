package com.example.cookwithus.pojo.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Time;

@Entity
@Table(
        name = "realization"
)
public class Realization {

    @Id
    @Column(
            name = "realization_date"
    )
    private Date date;
    @Column(
            name = "realization_time"
    )

    private Time time;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(
            name = "r_lesson_name"
    )
    private Lesson lesson;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(
            name = "r_room_nr"
    )
    private Room room;

    public Realization() {
    }


    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
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

    public void setRealizingDate(Date date) {
    }

    public void setRealizingTime(Time time) {
    }
}
