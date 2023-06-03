package com.example.JavaShop.Entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Configuration;
import javax.persistence.Id;
import org.springframework.web.bind.annotation.RestController;

import javax.naming.Name;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "categories")
public class Category {

    @Id
    @Column(name="category_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String categoryName;

    public Category() {

    }

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, targetEntity = Good.class)
    private List<Good> goods;

}
