package com.example.musicapispringboot.exceptions;

public class ListEmptyException extends RuntimeException {
    public ListEmptyException(String message) {
        super(message);
    }
}
