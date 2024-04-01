package com.example.cookwithus;

import com.example.cookwithus.pojo.entity.*;
import com.example.cookwithus.repository.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CookwithusApplicationTests {

    @Autowired
    ClientRepository clientRepository;
    @Autowired
    LessonRepository lessonRepository;
    @Autowired
    RoomRepository roomRepository;
    @Autowired
    SeatRepository seatRepository;

    @Autowired
    GiftRepository giftRepository;

    CookwithusApplicationTests() {
    }

    @Test
    public void saveClientTest() {
        Client client = new Client("Gzim","Ismaili", "gezim.shkup@gmail.com");
        this.clientRepository.save(client);
        assertNotNull(this.clientRepository.findClientByName("Gzim"));
    }

    @Test
    public void updateClientTest() {
        Client client = this.clientRepository.findClientByName("Tringa");
        client.setEmail("tringa.shatmani@gmail.com");
        this.clientRepository.save(client);
        assertEquals("tringa.shatmani@gmail.com", client.getEmail());
    }

    @Test
    public void deleteClientTest() {
        Client client = this.clientRepository.findClientByName("Gzim");
        this.clientRepository.delete(client);
        assertNull(this.clientRepository.findClientByName("Gzim"));
    }

    @Test
    public void saveLessonTest() {
        Lesson lesson = new Lesson("Baked Potatoes", "Ground Farm");
        this.lessonRepository.save(lesson);
        assertNotNull(lesson);
    }

    @Test
    public void updateLessonTest() {
        Lesson lesson = this.lessonRepository.findLessonByName("Baked Potatoes");
        lesson.setCategory("Ground Farm");
        this.lessonRepository.save(lesson);
        assertNotEquals("Ground Farm", lesson.getCategory());
    }

    @Test
    public void deleteLessonTest() {
        Lesson lesson = this.lessonRepository.findLessonByName("Baked Potatoes");
        this.lessonRepository.delete(lesson);
        assertNull(this.lessonRepository.findLessonByName("Baked Potatoes"));
    }


    @Test
    public void saveRoomTest() {
        Room room = new Room(2, 30);
        this.roomRepository.save(room);
        assertNotNull(room);
    }

    @Test
    public void updateRoomTest() {
        Room room = this.roomRepository.findRoomByNr(4);
        room.setCapacity(35);
        this.roomRepository.save(room);
        assertEquals("35", room.getCapacity().toString());
    }

    @Test
    public void deleteRoomTest() {
        Room room = this.roomRepository.findRoomByNr(4);
        this.roomRepository.delete(room);
        assertNull(this.roomRepository.findRoomByNr(4));
    }

    @Test
    public void saveSeatTest() {
        Seat seat = new Seat(25);
        this.seatRepository.save(seat);
        assertNotNull(seat);
    }

    @Test
    public void updateSeatTest() {
        Seat seat = this.seatRepository.findSeatByNumber(25);
        seat.setNumber(26);
        this.seatRepository.save(seat);
        assertEquals("26", seat.getNumber().toString());
    }

    @Test
    public void deleteSeatTest() {
        Seat seat = this.seatRepository.findSeatByNumber(26);
        this.seatRepository.delete(seat);
        assertNull(this.seatRepository.findSeatByNumber(26));
    }

    @Autowired
    BookingRepository bookingRepository;

    @Test
    public void saveBookingTest(){
        Booking booking = new Booking();
        bookingRepository.save(booking);
        assertNotNull(booking);
    }

    @Test
    public void updateBookingTest(){
        Booking booking = bookingRepository.findBookingByNr("121");
        bookingRepository.save(booking);
        booking.setNr("122");
        assertNotEquals("122", booking.getNr());
    }

    @Test
    public void deleteBookingTest() {
        Booking booking = bookingRepository.findBookingByNr("123");
        bookingRepository.delete(booking);
        assertNull(bookingRepository.findBookingByNr("123"));
    }

    @Test
    public void saveGiftTest(){
        Gift gift = new Gift("1 month free access");
        giftRepository.save(gift);
        assertNotNull(gift);
    }

    @Test
    public void updateGiftTest(){
        Gift gift = giftRepository.findGiftByProducts("3 months free access");
        gift.setProducts("2 months free access");
        giftRepository.save(gift);
        assertEquals("2 months free access", gift.getProducts());
    }

    @Test
    public void deleteGiftTest(){
        Gift gift = giftRepository.findGiftByProducts("2 months free access");
        giftRepository.delete(gift);
        assertNull(giftRepository.findGiftByProducts("2 months free access"));
    }
}
