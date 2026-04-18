package com.example.musicapispringboot.models;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tbl_albums")
@JsonPropertyOrder({"idAlbum", "titleAlbum", "synopsis", "author", "releaseDate", "price", "gender"})
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAlbum;
    private String titleAlbum;
    private String synopsis;
    private String author;
    private LocalDate releaseDate;
    private Double price;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_gender")
    private Gender gender;

    public Album() {
    }

    public Album(String titleAlbum, String synopsis, String author, LocalDate releaseDate, Double price, Gender gender) {
        this.titleAlbum = titleAlbum;
        this.synopsis = synopsis;
        this.author = author;
        this.releaseDate = releaseDate;
        this.price = price;
        this.gender = gender;
    }

    public Long getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(Long idAlbum) {
        this.idAlbum = idAlbum;
    }

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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
