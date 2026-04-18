package com.example.musicapispringboot.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity()
@Table(name = "tbl_genders")
@JsonPropertyOrder({"idGender", "nameGender", "description", "status"})
public class Gender {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGender;
    private String nameGender;
    private String description;
    private boolean status;

    @OneToMany(mappedBy = "gender")
    @JsonIgnore
    public List<Album> albums = new ArrayList<>();

    public Gender() {
    }

    public Gender(String nameGender, String description, boolean status) {
        this.nameGender = nameGender;
        this.description = description;
        this.status = status;
    }

    public Long getIdGender() {
        return idGender;
    }

    public void setIdGender(Long idGender) {
        this.idGender = idGender;
    }

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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
