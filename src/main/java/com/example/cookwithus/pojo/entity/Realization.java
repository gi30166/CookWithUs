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
            name = "RealizationDate"
    )
    private Date date;
    @Column(
            name = "RealizationTime"
    )

    private Time time;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(
            name = "RLessonName"
    )
    private Lesson lesson;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(
            name = "RRoomNr"
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
