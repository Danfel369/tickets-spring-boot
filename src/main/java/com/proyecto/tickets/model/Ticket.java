package com.proyecto.tickets.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "tickets")
@Data

public class Ticket {
    @Id
    private String id;
    
}
