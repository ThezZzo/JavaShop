package com.example.JavaShop.Services.Category;

import com.example.JavaShop.Entity.Category;
import com.example.JavaShop.Entity.Company;

import java.util.List;

public interface ICategoryService {
    List<Category> getAllCategory();

    Category getCategoryById(Long id);

    Category createCategory(Category category);

    Category updateCategory(Long id, Category category);

    void deleteCategory(Long id);
}