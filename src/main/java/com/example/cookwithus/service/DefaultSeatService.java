package com.example.cookwithus.service;

import com.example.cookwithus.pojo.entity.Seat;
import com.example.cookwithus.pojo.input.SeatInput;
import com.example.cookwithus.repository.SeatRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultSeatService implements SeatService {
    @Autowired
    private SeatRepository seatRepository;

    public DefaultSeatService() {
    }

    public List<Seat> findAll() {
        return this.seatRepository.findAll();
    }

    public Seat findSeatByNumber(Integer number) {
        return this.seatRepository.findSeatByNumber(number);
    }

    public Seat save(SeatInput seatInput) {
        Integer number = seatInput.getNr();
        Seat seat = new Seat();
        seat.setNumber(number);
        return (Seat)this.seatRepository.save(seat);
    }

    public Seat update(Integer number, SeatInput seatInput) {
        Seat seat = this.seatRepository.findSeatByNumber(number);
        if (seat == null) {
            return null;
        } else {
            Integer updatedNumber = seatInput.getNr();
            seat.setNumber(updatedNumber);
            return (Seat)this.seatRepository.save(seat);
        }
    }

    public void delete(Integer number) {
        Seat seat = this.seatRepository.findSeatByNumber(number);
        if (seat != null) {
            this.seatRepository.delete(seat);
        }

    }

    @Override
    public List<Seat> findBookedSeats() {
        return null;
    }


}
