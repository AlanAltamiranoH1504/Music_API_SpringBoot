package com.example.musicapispringboot.dto.album;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDate;

public class CreateAlbumDTO {
    @NotBlank(message = "El nombre del album es requerido")
    @Length(max = 150, message = "Longitud no valida")
    private String titleAlbum;

    @Length(max = 1500, message = "Longitud no valida")
    private String synopsis;

    @NotBlank(message = "El autor es requerido")
    @Length(max = 150, message = "Longitud no valida")
    private String author;

    @NotNull(message = "La fecha de lanzamiento es requerida")
    private LocalDate releaseDate;

    @NotNull(message = "El precio es requerido")
    @Positive(message = "El precio es requerido")
    private Double price;

    @NotNull(message = "El genero del album es requerido")
    private Long idGender;

    public String getTitleAlbum() {
        return titleAlbum;
    }

    public void setTitleAlbum(String titleAlbum) {
        this.titleAlbum = titleAlbum;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getIdGender() {
        return idGender;
    }

    public void setIdGender(Long idGender) {
        this.idGender = idGender;
    }
}
