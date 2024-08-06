package com.johan.springboot.fma.springboot_fma.controllers;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.johan.springboot.fma.springboot_fma.models.Error;
import com.johan.springboot.fma.springboot_fma.models.MissingParameterException;


@RestControllerAdvice
public class ErrorHandlerException {

    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<Error> handleException(Exception ex) {
        Error error = new Error();
        error.setMessage(ex.getMessage());
        error.setError("An unexpected error occurred");
        error.setStatus(500);
        error.setDate(new Date());
        
        return ResponseEntity.status(500).body(error);
    }

     @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<Error> handle404(NoHandlerFoundException ex) {
        Error error = new Error();
        error.setMessage("The requested URL was not found");
        error.setError("Not Found");
        error.setStatus(404);
        error.setDate(new Date());
        
        return ResponseEntity.status(404).body(error);
    }

    @ExceptionHandler(MissingParameterException.class)
    public ResponseEntity<String> handleMissingParameterException(MissingParameterException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }
}


