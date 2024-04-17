package com.example.cookwithus.controller;
import com.example.cookwithus.pojo.entity.Lesson;
import com.example.cookwithus.pojo.input.LessonInput;
import com.example.cookwithus.service.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LessonController {
    @Autowired
    private LessonService lessonService;

    public LessonController() {
    }

    @GetMapping("/lesson")
    public List<Lesson> getLessons() {
        return this.lessonService.findAll();
    }

    @GetMapping("/lesson/{name}")
    public Lesson getLessonByName(@PathVariable String name){
        return this.lessonService.findLessonByName(name);
    }

    @PostMapping("/lesson")
    public Lesson insertNewLesson(@RequestBody LessonInput lessonInput){

        return this.lessonService.save(lessonInput);
    }

    @PutMapping("lesson/{name}")
    public Lesson updateLesson(@PathVariable String name,
                               @RequestBody LessonInput lessonInput){

        return this.lessonService.update(name, lessonInput);
    }

    @DeleteMapping("lesson/{name}")
    public Boolean deleteClient(@PathVariable String name){
        this.lessonService.delete(name);
        return true;
    }

    @GetMapping("lesson/bookings")
    public List<Lesson>getBookedLessons(){
        return lessonService.findBookedLessons();
    }
}