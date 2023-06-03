package com.example.JavaShop.Entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Id;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name="companies")
public class Company {
    @Id
    @Column(name="company_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(name = "name", nullable = false)

    private String name;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL, targetEntity = Good.class)
    private List<Good> goods;

    public Company() {

    }
}
