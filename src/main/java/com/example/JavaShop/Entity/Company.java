package com.example.JavaShop.Entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="companies")

public class Company {

    @Id
    @Column(name="companyId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private long companyId;

    @Column(name = "name", nullable = false)
    @Getter
    @Setter
    private String name;

    @OneToMany(mappedBy = "company")
    @Getter
    @Setter
    private Set<Good> goods;

    public Company() {

    }
}
