package com.proyecto.tickets.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

<<<<<<< HEAD
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

=======

import lombok.Builder;
import lombok.Data;

@Document(collection = "usuario_auth")

@Data
@Builder
public class UsuarioAuth {
    @Id
    private ObjectId usuarioId;

    @Indexed(unique = true)
    private String usuario;
    private String contrasena;
>>>>>>> 434f1ac0d2237456d3ba4fcf93a840a5c9c2a0e0
    private Rol rol;
}
