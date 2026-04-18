package com.example.musicapispringboot.exceptions;

import com.example.musicapispringboot.services.interfaces.IResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@org.springframework.web.bind.annotation.RestControllerAdvice
public class RestControllerAdvice {
    @Autowired
    private IResponseService iResponseService;

    @ExceptionHandler(ListEmptyException.class)
    public ResponseEntity<?> handleListEmptyException(ListEmptyException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                iResponseService.generateResponse("Ocurrio un error en el retorno de la lista", ex.getMessage())
        );
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<?> handleHttpMessageNotReadableException(HttpMessageNotReadableException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(
                iResponseService.generateResponse("Ocurrio un error el body de la peticion", ex.getMessage())
        );
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
        Map<String, Object> json = new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(error -> {
            json.put(error.getField(), error.getDefaultMessage());
        });
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(json);
    }

    @ExceptionHandler(CreateEntityException.class)
    public ResponseEntity<?> handleCreateEntityException(CreateEntityException ex) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body(
                iResponseService.generateResponse("Ocurrio un error en la creacion de la entidad", ex.getMessage())
        );
    }
}
