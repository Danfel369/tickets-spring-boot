package com.proyecto.tickets.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Document(collection = "user_auth")
@Data
@Builder

public class UsuarioAuth {
    @Id
    private ObjectId Id;

    @Indexed(unique = true)
    private String nameUser;
    
    private String passUser;

    private Rol rol;
}
