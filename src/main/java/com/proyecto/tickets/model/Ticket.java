package com.proyecto.tickets.model;

import java.time.LocalDateTime;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "tickets")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
    @Id
    private ObjectId TicketId;
    
    @CreatedDate
    private LocalDateTime fechaCreacion;
    @CreatedDate
    private LocalDateTime fechaCierre;

    private String nombreCaso;
    private Estado estadoTicket;
    private Prioridad prioridadTicket;
    private String creadoPor;
    private String cerradoPor;
    private String asignado;

}
