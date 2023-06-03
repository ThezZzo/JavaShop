package com.example.JavaShop.Services.UserDetails;

import com.example.JavaShop.Repository.UserRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JwtUserDetailsService implements IUserDetailsService {

    final UserRepository userRepository;

    public JwtUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public UserDetails loadUserByEmail(String email) throws UsernameNotFoundException {
        final com.example.JavaShop.Entity.User findUser = userRepository.findByEmail(email);
        List<GrantedAuthority> authorityList = new ArrayList<>();
        authorityList.add(new SimpleGrantedAuthority("USER_ROLE"));
        if (findUser == null) {
            throw new UsernameNotFoundException(email);
        }
        UserDetails user = User.withUsername(findUser.getEmail()).password(findUser.getPassword()).authorities("USER").build();
        return new User(findUser.getEmail(), findUser.getPassword(), authorityList);
    }

    public UserDetails createUserDetails(String email, String password) {
        List<GrantedAuthority> authorityList = new ArrayList<>();
        authorityList.add(new SimpleGrantedAuthority("USER_ROLE"));
        return new User(email, password, authorityList);
    }
}