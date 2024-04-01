package com.example.cookwithus.service;

import com.example.cookwithus.pojo.entity.Gift;
import com.example.cookwithus.pojo.input.GiftInput;

import java.util.List;

public interface GiftService {
    List<Gift> findAll();

    Gift findGiftByProduct(String product);

    Gift save(GiftInput giftInput);

    Gift update(String product, GiftInput giftInput);

    void delete(String product);
}
