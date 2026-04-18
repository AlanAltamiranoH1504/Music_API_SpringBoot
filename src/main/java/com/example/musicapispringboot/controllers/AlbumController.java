package com.example.musicapispringboot.controllers;

import com.example.musicapispringboot.dto.album.CreateAlbumDTO;
import com.example.musicapispringboot.repositories.IAlbumRepository;
import com.example.musicapispringboot.services.interfaces.IAlbumService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/album")
public class AlbumController {
    @Autowired
    protected IAlbumService iAlbumService;

    @GetMapping("")
    public ResponseEntity<?> listAlbums() {
        return ResponseEntity.status(HttpStatus.OK).body(iAlbumService.getAllAlbums());
    }

    @PostMapping("")
    public ResponseEntity<?> saveAlbum(@Valid @RequestBody CreateAlbumDTO createAlbumDTO) {
        return ResponseEntity.status(HttpStatus.OK).body(iAlbumService.saveAlbum(createAlbumDTO));
    }
}
