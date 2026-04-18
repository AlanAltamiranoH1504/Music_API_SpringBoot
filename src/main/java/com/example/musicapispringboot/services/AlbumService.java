package com.example.musicapispringboot.services;

import com.example.musicapispringboot.dto.ListEntityDTO;
import com.example.musicapispringboot.dto.album.CreateAlbumDTO;
import com.example.musicapispringboot.exceptions.ListEmptyException;
import com.example.musicapispringboot.models.Album;
import com.example.musicapispringboot.repositories.IAlbumRepository;
import com.example.musicapispringboot.repositories.IGenderRepository;
import com.example.musicapispringboot.services.interfaces.IAlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService implements IAlbumService {
    @Autowired
    private IAlbumRepository iAlbumRepository;
    @Autowired
    private IGenderRepository iGenderRepository;

    @Override
    public List<Album> getAllAlbums() {
        List<Album> albums = iAlbumRepository.findAll();
        if (albums.isEmpty()) {
            throw new ListEmptyException("La lista de albums se encuentra vacia");
        }
        return albums;
    }

    @Override
    public List<Album> getAlbum(Long idAlbum) {
        return List.of();
    }

    @Override
    public Album saveAlbum(CreateAlbumDTO createAlbumDTO) {
        Album album = new Album(
                createAlbumDTO.getTitleAlbum(),
                createAlbumDTO.getSynopsis(),
                createAlbumDTO.getAuthor(),
                createAlbumDTO.getReleaseDate(),
                createAlbumDTO.getPrice(),
                iGenderRepository.getReferenceById(createAlbumDTO.getIdGender())
        );
        return iAlbumRepository.save(album);
    }

    @Override
    public Album updateAlbum() {
        return null;
    }

    @Override
    public void deletAlmbum(Long idAlbum) {

    }
}
