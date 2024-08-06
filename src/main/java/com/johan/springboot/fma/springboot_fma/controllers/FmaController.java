package com.johan.springboot.fma.springboot_fma.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.johan.springboot.fma.springboot_fma.models.MissingParameterException;
import com.johan.springboot.fma.springboot_fma.models.User;
import com.johan.springboot.fma.springboot_fma.services.UserService;


@RestController
public class FmaController {

    @Autowired
    UserService userService;

    @GetMapping("/fma")
    public ResponseEntity<?> listofFmau() {
        
        //Llamo al metodo donde tengo todos los usuarios
        List<User> users = userService.findAll();
        return ResponseEntity.ok(users);
    }

    //Buscar por Id, se usa Pathvariable siempre para buscar por Id
    //y si queremos usar Strings usamos RequestParam
    @GetMapping("/fma/{id}")
    public User listofFmauId(@PathVariable Long id) {
        
        //Llamo al metodo donde tengo todos los usuarios
        User users = userService.findById(id);
        return users;
    }

    @GetMapping("/fmalist")
    public ResponseEntity<List<User>> listOfFmaNames(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String role) {
    
        // Verificar que los parámetros necesarios estén presentes
        if (name == null || role == null) {
            throw new MissingParameterException("Both 'name' and 'role' parameters are required.");
        }
    
        // Obtener los usuarios basados en los parámetros
        List<User> users = userService.findByNameAndRole(name, role);
    
        // Retornar la lista de usuarios
        return ResponseEntity.ok(users);
    }
    
}
