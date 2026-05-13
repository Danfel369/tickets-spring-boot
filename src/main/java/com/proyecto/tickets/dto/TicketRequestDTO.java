package com.proyecto.tickets.dto;

import java.time.LocalDate;

import org.bson.types.ObjectId;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data

public class TicketRequestDTO {

    @NotBlank
    private String ticketName;

    @NotBlank
    private ObjectId ticketCreatedBy;

    @NotBlank
    private LocalDate ticketDateCreation;

}