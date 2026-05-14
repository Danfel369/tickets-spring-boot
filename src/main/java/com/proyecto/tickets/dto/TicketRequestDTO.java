package com.proyecto.tickets.dto;

import com.proyecto.tickets.model.Prioridad;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data

public class TicketRequestDTO {

    @NotBlank
    private String ticketName;

    @NotBlank
    private String ticketCreatedBy;

    @NotNull
    private Prioridad ticketPriority;

}