package com.proyecto.tickets.model;

import java.time.LocalDateTime;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.index.TextIndexed;
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
    private ObjectId ticketId;
    
    @CreatedDate
    private LocalDateTime fechaCreacion;
    
    private LocalDateTime fechaCierre;

    @TextIndexed
    private String nombreCaso;
    
    @Indexed
    private Estado estadoTicket;
    
    @Indexed
    private Prioridad prioridadTicket;

    @Indexed
    private ObjectId creadoPorId;
    
    @Indexed
    private ObjectId cerradoPorId;
    
    @Indexed
    private ObjectId asignadoAId;

}
