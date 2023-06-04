package com.example.JavaShop.Repository;

import com.example.JavaShop.Entity.Category;
import com.example.JavaShop.Entity.Good;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsRepository extends CrudRepository<Good, Long> {
    List<Good> findAllByCategory(Category category);
}
