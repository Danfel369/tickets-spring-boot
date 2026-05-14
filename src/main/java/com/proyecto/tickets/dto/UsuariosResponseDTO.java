package com.proyecto.tickets.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UsuariosResponseDTO {
    private String nombre;
    private String apellido;
    private String email;
    private String userName;
    private String role;
}
