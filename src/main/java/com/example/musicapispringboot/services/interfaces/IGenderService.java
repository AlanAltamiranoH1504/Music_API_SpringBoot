package com.example.musicapispringboot.services.interfaces;

import com.example.musicapispringboot.dto.ListEntityDTO;
import com.example.musicapispringboot.dto.genders.CreateGenderDTO;
import com.example.musicapispringboot.models.Gender;

import java.util.List;

public interface IGenderService {
    public abstract List<Gender> getGenders(ListEntityDTO listEntityDTO);
    public abstract Gender getGender(Long idGender);
    public abstract Gender saveGender(CreateGenderDTO createGenderDTO);
    public abstract Gender updateGender();
    public abstract void deleteGender(Long idGender);
}
