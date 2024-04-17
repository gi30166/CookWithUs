package com.example.cookwithus.pojo.input;
import java.sql.Time;
import java.util.Date;

public class BookingInput {

    private String nr;
    private Date date;
    private Time time;

    public BookingInput() {
    }

    public BookingInput(String nr, Date date, Time time) {
        this.nr = nr;
        this.date = date;
        this.time = time;
    }

    public String getNr() {
        return nr;
    }

    public void setNr(String nr) {
        this.nr = nr;
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
