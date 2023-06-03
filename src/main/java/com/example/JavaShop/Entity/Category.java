package com.example.JavaShop.Entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.RestController;

import javax.naming.Name;
import javax.persistence.*;

@Entity
@Table(name = "categories")
public class Category {

    @Id
    @Column(name="categoryId", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long categoryId;

    @Column(name = "name", nullable = false)
    @Getter
    @Setter
    private String categoryName;

    public Category() {

    }

}
