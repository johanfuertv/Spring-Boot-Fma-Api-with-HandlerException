package com.johan.springboot.fma.springboot_fma.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.johan.springboot.fma.springboot_fma.models.User;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    List<User> users;

    @Override
    public User findById(Long id) {
        User user = null;
        for (User u : users) {
            if (u.getId().equals(id)) {
                user = u; // User == U
                break;
            }
        }
        return user;
    }

    @Override
    public List<User> findAll() {
        
        return users;
    }

    @Override
    public List<User> findByNameAndRole(String name, String role) {
        List<User> user = new ArrayList<>();
        for (User u : users) {
            if (u.getName().equals(name) && u.getRole().equals(role)) {
                user.add(u); //Añado u a la lista user que proviene del metodo User
            }
        }
        return user;
    }
}
