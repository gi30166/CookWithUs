package com.example.cookwithus.service;

import com.example.cookwithus.pojo.entity.Realization;
import com.example.cookwithus.pojo.input.RealizationInput;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

public interface RealizationService {
    List<Realization> findAll();

    Realization findRealizationByDateAndTime(Date date, Time time);

    Realization save(RealizationInput realizationInput);

    Realization update(Date date, Time time, RealizationInput realizationInput);

    void delete(Date date, Time time);
    List<Realization> findRealizationByLessonName(String name);
}
