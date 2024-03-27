package com.example.MakeupClasses.pojo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(
        name = "seat"
)
public class Seat {
    @Id
    @Column(
            name = "SeatNumber"
    )
    private Integer number;
    @ManyToOne
    @JsonManagedReference
    @JoinColumn(
            name = "RoomNumber"
    )
    private Room room;


    @OneToMany(
            mappedBy = "seat"
    )
    @JsonBackReference
    private List<Gift> gifts;//renditje


    public Seat() {
        this.number = 0;
    }


    public List<Gift> getGifts() {
        return gifts;
    }

    public void setGifts(List<Gift> gifts) {
        this.gifts = gifts;
    }

    public Seat(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return this.number;
    }

    public void setNumber(Integer nr) {
        this.number = nr;
    }

    public Room getRoom() {
        return this.room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }



    public String toString() {
        return "Seat{nr=" + this.number + "}";
    }

}
