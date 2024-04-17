package com.example.cookwithus.controller;
import com.example.cookwithus.pojo.entity.Seat;
import com.example.cookwithus.pojo.input.SeatInput;
import com.example.cookwithus.service.SeatService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SeatController {
    @Autowired
    private SeatService seatService;

    public SeatController() {
    }

    @GetMapping({"/seat"})
    public List<Seat> getSeat() {
        return this.seatService.findAll();
    }

    @GetMapping({"/seat/{number}"})
    public Seat getSeatByNumberAndRow(@PathVariable Integer number) {
        return this.seatService.findSeatByNumber(number);
    }

    @PostMapping({"/seat"})
    public Seat insertNewSeat(@RequestBody SeatInput seatInput) {
        return this.seatService.save(seatInput);
    }

    @PutMapping({"seat/{number}"})
    public Seat updatedSeat(@PathVariable Integer number, @RequestBody SeatInput seatInput) {
        return this.seatService.update(number, seatInput);
    }

    @DeleteMapping({"seat/{number}"})
    public Boolean deleteSeat(@PathVariable Integer number) {
        this.seatService.delete(number);
        return true;
    }

    @GetMapping({"booked/seats"})
    public List<Seat> getBookedSeats() {
        return this.seatService.findBookedSeats();
    }
}
