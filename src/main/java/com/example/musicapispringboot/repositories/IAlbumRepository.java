package com.example.musicapispringboot.repositories;

import com.example.musicapispringboot.models.Album;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IAlbumRepository extends JpaRepository<Album, Long> {

}
