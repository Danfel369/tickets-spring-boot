package com.proyecto.tickets.dto;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

@Builder
@Data

public class RegistrarseResponseDTO {
    private LocalDateTime fechaRegistro;
    private String mensaje;
}