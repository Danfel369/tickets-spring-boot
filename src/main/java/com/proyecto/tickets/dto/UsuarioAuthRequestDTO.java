package com.proyecto.tickets.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class UsuarioAuthRequestDTO {

    @NotBlank
    private String user;

    @NotBlank
    private String password;

}
