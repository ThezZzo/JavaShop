package com.example.JavaShop.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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

    @JsonBackReference
    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL, targetEntity = Good.class, orphanRemoval = true)
    private List<Good> goods = new ArrayList<Good>();;

    public Company() {

    }
}
