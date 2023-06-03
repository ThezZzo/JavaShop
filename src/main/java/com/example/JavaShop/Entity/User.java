package com.example.JavaShop.Entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Id;
import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name="Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(unique = true, nullable = false)

    private String email;

    @Column(nullable = false)

    private String password;

    @Column(nullable = false)

    private String role;

    public User(String email, String password, String role) {
        this.email = email;
        this.password = password;
        this.role = role;
    }


    public User() {

    }
}