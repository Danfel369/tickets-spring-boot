package com.proyecto.tickets.dto;

import jakarta.validation.constraints.NotBlank;

import lombok.Data;

@Data

public class UsuarioRequestAuthDTO {

    @NotBlank
    private String nombreUsuario;

    @NotBlank
    private String contrasenaUsuario;
}