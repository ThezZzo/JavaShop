package com.example.JavaShop.Controller;

import com.example.JavaShop.Entity.Good;
import com.example.JavaShop.Services.Good.IGoodsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class GoodsController {
    private final IGoodsService iGoodsService;

    public GoodsController(IGoodsService iGoodsService) {
        this.iGoodsService = iGoodsService;
    }

    @GetMapping("/goods")
    public List<Good> getAllGoods() {
        return iGoodsService.getAllGoods();
    }

    @GetMapping("/goods/{id}")
    public Good getGoodById(@PathVariable Long id) {
        return iGoodsService.getGoodById(id);
    }

    @PostMapping("/goods")
    public Good createGood(@RequestBody Good good) {
        return iGoodsService.createGood(good);
    }

    @PutMapping("/goods/{id}")
    public Good updateGood(@PathVariable Long id, @RequestBody Good good) {
        return iGoodsService.updateGood(id, good);
    }

    @DeleteMapping("/goods/{id}")
    public void deleteGood(@PathVariable Long id) {
        iGoodsService.deleteGood(id);
    }
}
