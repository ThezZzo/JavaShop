package com.example.JavaShop.Services.Good;

import com.example.JavaShop.Entity.Good;
import com.example.JavaShop.Repository.GoodsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodService implements IGoodsService {

    private final GoodsRepository goodsRepository;

    public GoodService(GoodsRepository goodsRepository) {
        this.goodsRepository = goodsRepository;
    }

    @Override
    public List<Good> getAllGoods() {
        return goodsRepository.findAll();
    }

    @Override
    public Good getGoodById(Long id) {
        return goodsRepository.findById(id).orElseThrow(() -> new RuntimeException("Товар не найден"));
    }

    @Override
    public Good createGood(Good good) {

        return goodsRepository.save(good);
    }

    @Override
    public Good updateGood(Long id, Good good) {
        Good existingGood = goodsRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        existingGood.setCategory(good.getCategory());
        existingGood.setName(good.getName());
        existingGood.setPrice(good.getPrice());
        existingGood.setCompany(good.getCompany());
        return goodsRepository.save(existingGood);
    }

    @Override
    public void deleteGood(Long id) {
        goodsRepository.deleteById(id);
    }
}