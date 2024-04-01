package com.example.cookwithus.service;

import com.example.cookwithus.pojo.entity.Room;
import com.example.cookwithus.pojo.input.RoomInput;
import java.util.List;

public interface RoomService {
    List<Room> findAll();

    Room findRoomByNumber(Integer number);

    Room save(RoomInput roomInput);

    Room update(Integer number, RoomInput roomInput);

    void delete(Integer number);
}
