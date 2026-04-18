package com.example.musicapispringboot.dto;

import jakarta.validation.constraints.NotNull;

public class ListEntityDTO {
    @NotNull(message = "El tipo de listado es requerido (true/false)")
    private Boolean status;

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
