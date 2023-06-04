package com.example.JavaShop.Controller;

import com.example.JavaShop.Entity.Category;
import com.example.JavaShop.Entity.Good;
import com.example.JavaShop.Services.Category.ICategoryService;
import com.example.JavaShop.Services.Good.IGoodsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class GoodsController {
    private final IGoodsService iGoodsService;

    private final ICategoryService iCategoryService;

    public GoodsController(IGoodsService iGoodsService, ICategoryService iCategoryService) {
        this.iGoodsService = iGoodsService;
        this.iCategoryService = iCategoryService;
    }

    @GetMapping("/goods")
    public List<Good> getAllGoods() {
        return iGoodsService.getAllGoods();
    }

    @GetMapping("/goods/category/{id}")
    public List<Good> getAllGoodsCategory(@PathVariable Long id) {
        return iGoodsService.getAllGoodsCategory(iCategoryService.getCategoryById(id));
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
    @PatchMapping(value = "/goods/{id}/price", consumes = {"application/json"})
    public Good updateGoodPrice(@PathVariable Long id, @RequestBody Good good) {
        return iGoodsService.updateGoodPrice(id, good);
    }
    @DeleteMapping("/goods/{id}")
    public void deleteGood(@PathVariable Long id) {
        iGoodsService.deleteGood(id);
    }
}
