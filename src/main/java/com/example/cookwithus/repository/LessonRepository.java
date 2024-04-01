package com.example.cookwithus.repository;

import com.example.cookwithus.pojo.entity.Lesson;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LessonRepository extends CrudRepository<Lesson, String> {
    List<Lesson> findAll();

    Lesson findLessonByName(String name);
    @Query("select l from Lesson l join Booking b on l.name=b.lesson.name")
    List<Lesson> findBookedLessons();

}
