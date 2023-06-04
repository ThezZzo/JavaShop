package com.example.JavaShop.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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

    @JsonBackReference
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, targetEntity = Good.class, orphanRemoval = true)
    private List<Good> goods = new ArrayList<Good>();

}
