package com.example.JavaShop.Services.Good;

import com.example.JavaShop.Entity.Category;
import com.example.JavaShop.Entity.Good;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IGoodsService {
    List<Good> getAllGoods();
    List<Good> getAllGoodsCategory(Category category);

    Good getGoodById(Long id);

    Good createGood(Good good);

    Good updateGood(Long id, Good good);

    void deleteGood(Long id);
    Good updateGoodPrice(Long id, Good good);
}