package com.proyecto.tickets.dto;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class TicketResponseDTO {

    private LocalDateTime dateTicket;
    private String mensaje;
}
