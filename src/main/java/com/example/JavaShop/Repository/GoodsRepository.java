package com.example.JavaShop.Repository;

import com.example.JavaShop.Entity.Good;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodsRepository extends JpaRepository<Good, Long> {

}
