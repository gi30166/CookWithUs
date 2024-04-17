package com.example.cookwithus.controller;

import com.example.cookwithus.pojo.entity.Room;
import com.example.cookwithus.pojo.input.RoomInput;
import com.example.cookwithus.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoomController {

    @Autowired
    private RoomService roomService;

    public RoomController() {
    }

    @GetMapping("/room")
    public List<Room> getRoom() {
        return this.roomService.findAll();
    }

    @GetMapping("/room/{number}")
    public Room getRoomByNumber(@PathVariable Integer number){
        return this.roomService.findRoomByNumber(number);
    }

    @PostMapping("/room")
    public Room insertNewRoom(@RequestBody RoomInput roomInput){

        return this.roomService.save(roomInput);
    }

    @PutMapping("room/{number}")
    public Room updateRoom(@PathVariable Integer number,
                           @RequestBody RoomInput roomInput){

        return this.roomService.update(number, roomInput);
    }

    @DeleteMapping("room/{number}")
    public Boolean deleteClient(@PathVariable Integer number){
        this.roomService.delete(number);
        return true;
    }
}
