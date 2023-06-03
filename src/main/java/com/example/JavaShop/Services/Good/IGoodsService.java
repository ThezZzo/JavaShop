package com.example.JavaShop.Services.Good;

import com.example.JavaShop.Entity.Good;

import java.util.List;

public interface IGoodsService {
    List<Good> getAllGoods();

    Good getGoodById(Long id);

    Good createGood(Good good);

    Good updateGood(Long id, Good good);

    void deleteGood(Long id);
}