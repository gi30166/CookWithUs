package com.example.cookwithus.controller;
import com.example.cookwithus.pojo.entity.Realization;
import com.example.cookwithus.pojo.input.RealizationInput;
import com.example.cookwithus.service.RealizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

@RestController
public class RealizationController {

    @Autowired
    private RealizationService realizationService;

    @GetMapping("/realization")
    public List<Realization> getRealizations() {
        return realizationService.findAll();
    }

    @GetMapping("/realization/{date}/{time}")
    public Realization getRealizationsByDateAndTime(@PathVariable Date date , @PathVariable Time time){
        return realizationService.findRealizationByDateAndTime(date, time);
    }

    @PostMapping("/realization")
    public Realization insertNewRealization(@RequestBody RealizationInput realizationInput){

        return realizationService.save(realizationInput);
    }

    @PutMapping("realization/{date}/{time}")
    public Realization updatedStream(@PathVariable Date date, @PathVariable Time time,
                                     @RequestBody RealizationInput realizationInput){

        return realizationService.update(date, time, realizationInput);
    }

    @DeleteMapping("realization/{date}/{time}")
    public Boolean deleteRealization(@PathVariable Date date, @PathVariable Time time){
        realizationService.delete(date , time);
        return true;
    }

    @GetMapping("realization/bookings/{name}")
    public List<Realization>getRealizationsByClassName(@PathVariable String name){
        return realizationService.findRealizationByLessonName(name);
    }
}
