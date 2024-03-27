package com.example.cookwithus.pojo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.List;
@Entity
@Table(
        name = "room"
)
public class Room {
    @Id
    @Column(
            name = "RoomNumber"
    )
    private Integer nr;
    @Column(
            name = "RoomCapacity"
    )
    private Integer capacity;
    @OneToMany(
            mappedBy = "room",
            cascade = {
                    CascadeType.REMOVE
            }
    )
    @JsonBackReference
    private List<Seat> seatList;
    @OneToMany(
            mappedBy = "room",
            cascade = {
                    CascadeType.REMOVE
            }
    )
    @JsonBackReference
    private List<Realization> realizationsList;

    public Room() {
        this.nr = 0;
        this.capacity = 0;
    }


    public Room(Integer nr, Integer capacity) {
        this.nr = nr;
        this.capacity = capacity;
    }

    public Integer getNr() {
        return nr;
    }

    public void setNr(Integer nr) {
        this.nr = nr;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public List<Seat> getSeatList() {
        return seatList;
    }

    public void setSeatList(List<Seat> seatList) {
        this.seatList = seatList;
    }

    public List<Realization> getRealizationsList() {
        return realizationsList;
    }

    public void setRealizationsList(List<Realization> realizationsList) {
        this.realizationsList = realizationsList;
    }
}
