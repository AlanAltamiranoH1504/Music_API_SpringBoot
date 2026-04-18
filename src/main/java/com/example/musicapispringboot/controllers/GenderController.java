package com.example.musicapispringboot.controllers;

import com.example.musicapispringboot.dto.ListEntityDTO;
import com.example.musicapispringboot.dto.genders.CreateGenderDTO;
import com.example.musicapispringboot.services.interfaces.IGenderService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gender")
public class GenderController {
    @Autowired
    private IGenderService iGenderService;

    @GetMapping("")
    public ResponseEntity<?> listGenders(@Valid @RequestBody ListEntityDTO listEntityDTO) {
        return ResponseEntity.status(HttpStatus.OK).body(iGenderService.getGenders(listEntityDTO));
    }

    @PostMapping("")
    public ResponseEntity<?> saveGender(@Valid @RequestBody CreateGenderDTO createGenderDTO) {
        return ResponseEntity.status(HttpStatus.OK).body(iGenderService.saveGender(createGenderDTO));
    }
}
