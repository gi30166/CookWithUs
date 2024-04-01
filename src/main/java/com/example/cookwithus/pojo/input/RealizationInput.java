package com.example.cookwithus.pojo.input;

import java.sql.Date;
import java.sql.Time;

public class RealizationInput {
    private String lessonName;
    private Integer roomNumber;
    private Date date;
    private Time time;

    public RealizationInput() {
    }

    public RealizationInput(String lessonName, Integer roomNumber, Date date, Time time) {
        this.lessonName = lessonName;
        this.roomNumber = roomNumber;
        this.date = date;
        this.time = time;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
