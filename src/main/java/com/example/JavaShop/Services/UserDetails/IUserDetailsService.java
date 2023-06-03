package com.example.JavaShop.Services.UserDetails;

import org.springframework.security.core.userdetails.UserDetails;

public interface IUserDetailsService {
    public UserDetails loadUserByEmail(String email);
}
