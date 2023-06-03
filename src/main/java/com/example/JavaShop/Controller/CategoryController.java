package com.example.JavaShop.Controller;

import com.example.JavaShop.Entity.Category;
import com.example.JavaShop.Services.Category.ICategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CategoryController {
    private final ICategoryService iCategoryService;

    public CategoryController(ICategoryService iCategoryService) {
        this.iCategoryService = iCategoryService;
    }

    @GetMapping("/categories")
    public List<Category> getAllCompany() {
        return iCategoryService.getAllCategory();
    }

    @GetMapping("/categories/{id}")
    public Category getGoodById(@PathVariable Long id) {
        return iCategoryService.getCategoryById(id);
    }

    @PostMapping("/categories")
    public Category createGood(@RequestBody Category category) {
        return iCategoryService.createCategory(category);
    }

    @PutMapping("/categories/{id}")
    public Category updateGood(@PathVariable Long id, @RequestBody Category category) {
        return iCategoryService.updateCategory(id, category);
    }

    @DeleteMapping("/categories/{id}")
    public void deleteGood(@PathVariable Long id) {
        iCategoryService.deleteCategory(id);
    }
}