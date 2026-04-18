package com.example.musicapispringboot.services.interfaces;

import com.example.musicapispringboot.dto.ListEntityDTO;
import com.example.musicapispringboot.dto.album.CreateAlbumDTO;
import com.example.musicapispringboot.models.Album;

import java.util.List;

public interface IAlbumService {
    public abstract List<Album> getAllAlbums();
    public abstract List<Album> getAlbum(Long idAlbum);
    public abstract Album saveAlbum(CreateAlbumDTO createAlbumDTO);
    public abstract Album updateAlbum();
    public abstract void deletAlmbum(Long idAlbum);
}
