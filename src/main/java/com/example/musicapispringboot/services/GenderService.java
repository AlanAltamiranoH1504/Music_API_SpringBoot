package com.example.musicapispringboot.services;

import com.example.musicapispringboot.dto.ListEntityDTO;
import com.example.musicapispringboot.dto.genders.CreateGenderDTO;
import com.example.musicapispringboot.exceptions.CreateEntityException;
import com.example.musicapispringboot.exceptions.ListEmptyException;
import com.example.musicapispringboot.models.Gender;
import com.example.musicapispringboot.repositories.IGenderRepository;
import com.example.musicapispringboot.services.interfaces.IGenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.IllegalFormatCodePointException;
import java.util.List;
import java.util.Optional;

@Service
public class GenderService implements IGenderService {
    @Autowired
    private IGenderRepository iGenderRepository;

    @Override
    public List<Gender> getGenders(ListEntityDTO listEntityDTO) {
        List<Gender> genders = iGenderRepository.getAllGendersByStatus(listEntityDTO.getStatus());
        if (genders.isEmpty()) {
            throw new ListEmptyException("La lista de de generos musicales se encuentra vacia");
        }
        return genders;
    }

    @Override
    public Gender getGender(Long idGender) {
        return null;
    }

    @Override
    public Gender saveGender(CreateGenderDTO createGenderDTO) {
        Optional<Gender> nameGenderInUse = iGenderRepository.nameGenderInUse(createGenderDTO.getNameGender());
        if (nameGenderInUse.isPresent()) {
            throw new CreateEntityException("El nombre del genero musical ya se encuentra registrado en la base");
        }
        return iGenderRepository.save(new Gender(createGenderDTO.getNameGender(), createGenderDTO.getDescription(), true));
    }

    @Override
    public Gender updateGender() {
        return null;
    }

    @Override
    public void deleteGender(Long idGender) {

    }
}
