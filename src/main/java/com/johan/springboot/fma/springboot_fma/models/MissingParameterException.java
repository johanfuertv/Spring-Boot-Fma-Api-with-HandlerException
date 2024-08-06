package com.johan.springboot.fma.springboot_fma.models;

public class MissingParameterException extends RuntimeException {
    public MissingParameterException(String message) {
        super(message);
    }
}
