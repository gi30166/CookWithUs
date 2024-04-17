package com.example.cookwithus.service;

import com.example.cookwithus.pojo.entity.Gift;
import com.example.cookwithus.pojo.input.GiftInput;
import com.example.cookwithus.repository.GiftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DefaultGiftService implements GiftService{

    @Autowired
    private GiftRepository giftRepository;

    public DefaultGiftService() {
    }


    @Override
    public List<Gift> findAll() {
        return this.giftRepository.findAll();
    }

    @Override
    public Gift findGiftByProduct(String products) {
        return giftRepository.findGiftByProducts(products);
    }

    @Override
    public Gift save(GiftInput giftInput) {

        String products = giftInput.getProducts();
        Gift gift = new Gift();
        gift.setProducts(products);

        return giftRepository.save(gift);
    }

    @Override
    public Gift update(String products, GiftInput giftInput) {

        Gift gift = giftRepository.findGiftByProduct();

        if(gift == null){
            return null;
        }

        String updatedProducts = giftInput.getProducts();

        gift.setProducts(updatedProducts);

        return giftRepository.save(gift);
    }

    @Override
    public void delete(String products) {
        Gift gift = giftRepository.findGiftByProducts(products);
        if(gift != null){
            giftRepository.delete(gift);
        }
    }
}
