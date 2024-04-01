package com.example.cookwithus.repository;
import com.example.cookwithus.pojo.entity.Booking;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends CrudRepository<Booking, Integer> {

    //Responsible for management of stability(read and write in database)
    List<Booking> findAll();
    Booking findBookingByNr(String nr);
}
