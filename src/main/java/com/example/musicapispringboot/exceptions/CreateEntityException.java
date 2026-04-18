package com.example.musicapispringboot.exceptions;

public class CreateEntityException extends RuntimeException {
    public CreateEntityException(String message) {
        super(message);
    }
}
