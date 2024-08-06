package com.johan.springboot.fma.springboot_fma.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.johan.springboot.fma.springboot_fma.models.User;

@Configuration
public class AppConfig {

    @Bean
    List<User> lista(){
        List<User> user = new ArrayList<>();
        user.add(new User(1L, "Edward Elric", "Alchemist"));
        user.add(new User(2L, "Alphonse Elric", "Armored Soul"));
        user.add(new User(3L, "Roy Mustang", "Flame Alchemist"));
        user.add(new User(4L, "Riza Hawkeye", "Lieutenant"));
        user.add(new User(5L, "Winry Rockbell", "Mechanic"));
        user.add(new User(6L, "Alex Louis Armstrong", "Strong Arm Alchemist"));
        user.add(new User(7L, "Scar", "Avenger"));
        user.add(new User(8L, "Maes Hughes", "Lieutenant Colonel"));
        user.add(new User(9L, "Ling Yao", "Prince"));
        user.add(new User(10L, "Greed", "Homunculus"));
        return user;
    }
}