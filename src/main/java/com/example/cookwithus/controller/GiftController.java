package com.example.cookwithus.controller;
import com.example.cookwithus.pojo.entity.Gift;
import com.example.cookwithus.pojo.input.GiftInput;
import com.example.cookwithus.service.GiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GiftController {

    @Autowired
    private GiftService giftService;

    public GiftController() {
    }

    @GetMapping("/gift")
    public List<Gift> getGifts() {
        return giftService.findAll();
    }

    @GetMapping("/gift/{product}")
    public Gift getGiftByProduct(@PathVariable String product){
        return giftService.findGiftByProduct(product);
    }

    @PostMapping("/gift")
    public Gift insertNewGift(@RequestBody GiftInput giftInput){
        return giftService.save(giftInput);
    }

    @PutMapping("gift/{product}")
    public Gift updatedGift(@PathVariable String product,
                            @RequestBody GiftInput giftInput){
        return giftService.update(product, giftInput);
    }

    @DeleteMapping("gift/{product}")
    public Boolean deleteGift(@PathVariable String product){
        giftService.delete(product);
        return true;
    }
}
