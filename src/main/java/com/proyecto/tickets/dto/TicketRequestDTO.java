package com.proyecto.tickets.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TicketRequestDTO {
    @NotBlank
    private String tituloCaso;

    @NotBlank
    private  String creadorTicket;

    @NotBlank 
    private String cerradorTicket;

}
