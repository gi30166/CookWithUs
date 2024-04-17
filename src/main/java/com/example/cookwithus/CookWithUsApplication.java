package com.example.cookwithus;

import com.example.cookwithus.pojo.input.GiftInput;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CookWithUsApplication {

    public static void main(String[] args) {

        GiftInput giftInput = new GiftInput();
        giftInput.setProducts("Pasta with Salmon");
        System.out.println(giftInput);

        SpringApplication.run(CookWithUsApplication.class, args);
    }

}
