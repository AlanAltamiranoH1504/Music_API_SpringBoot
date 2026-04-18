package com.example.musicapispringboot.dto.genders;

import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

public class CreateGenderDTO {
    @NotBlank(message = "El nombre del genero musical es requerido")
    @Length(max = 150, message = "El nombre del genero no puede ser mayor a 150 caracteres")
    private String nameGender;

    @Length(max = 150, message = "La descripcion del genero no puede ser mayor a 150 caracteres")
    private String description;

    public String getNameGender() {
        return nameGender;
    }

    public void setNameGender(String nameGender) {
        this.nameGender = nameGender;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
