package com.proyecto.tickets.dto;

<<<<<<< HEAD
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
=======
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
>>>>>>> 434f1ac0d2237456d3ba4fcf93a840a5c9c2a0e0
