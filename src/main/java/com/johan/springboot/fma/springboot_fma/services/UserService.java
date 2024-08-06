package com.johan.springboot.fma.springboot_fma.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.johan.springboot.fma.springboot_fma.models.User;

@Service
public interface UserService {

    User findById(Long id);
    List<User> findAll();
    List<User> findByNameAndRole(String name,String role);
}