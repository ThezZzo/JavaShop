package com.example.JavaShop.Entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Id;

import javax.persistence.*;

@Data
@Entity
@Table(name="goods")
public class Good {

    @Id
    @Column(name="good_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(name = "name", nullable = false)

    private String name;

    @Column(name="price", nullable = false)

    private double price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="company_id", nullable=false)
    private Company company;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="category_id", nullable=false)
    private Category category;

    public Good() {

    }
}
