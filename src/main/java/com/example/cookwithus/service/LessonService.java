package com.example.cookwithus.service;

import com.example.cookwithus.pojo.entity.Lesson;
import com.example.cookwithus.pojo.input.LessonInput;
import java.util.List;

public interface LessonService {
    List<Lesson> findAll();


    Lesson save(LessonInput classInput);

    Lesson update(String name, LessonInput classInput);

    void delete(String name);

    Lesson findLessonByName(String name);

    List<Lesson> findBookedLessons();
}
