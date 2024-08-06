package com.johan.springboot.fma.springboot_fma.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.johan.springboot.fma.springboot_fma.models.User;

@Configuration
public class AppConfig {


    //Primero creamos el metodo

    @Bean
    List<User> lista(){
        List<User> user = new ArrayList<>();
        user.add(new User(null, null, null));
        user.add(new User(null, null, null));
        user.add(new User(null, null, null));
        user.add(new User(null, null, null));
        return user;
    }
}
