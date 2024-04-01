package com.example.cookwithus.pojo.input;

public class RoomInput {
    private Integer nr;
    private Integer capacity;

    public RoomInput() {
    }

    public RoomInput(Integer nr, Integer capacity) {
        this.nr = nr;
        this.capacity = capacity;
    }

    public Integer getNr() {
        return this.nr;
    }

    public void setNr(Integer nr) {
        this.nr = nr;
    }

    public Integer getCapacity() {
        return this.capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
}
