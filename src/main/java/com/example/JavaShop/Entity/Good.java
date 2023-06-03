package com.example.JavaShop.Entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@Table(name="goods")
public class Good {

    @Id
    @Column(name="goodId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private long goodId;

    @Column(name = "name")
    @Getter
    @Setter
    private String name;

    @Column(name="price")
    @Getter
    @Setter
    private double price;

    @ManyToOne
    @JoinColumn(name="companyId", nullable=false)
    @Getter
    @Setter
    private Company company;

    @ManyToOne
    @JoinColumn(name="categoryId", nullable=false)
    @Getter
    @Setter
    private Category category;

    public Good() {

    }
}
