package com.proyecto.tickets.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class RegistrarseRequestDTO {
    @NotBlank
    private String nombre;

    @NotBlank
    private String apellido;

    @NotBlank
    private String contrasena;

    @NotBlank
    private String confirmContra;

    @NotBlank
    @Email
    private String email;

}