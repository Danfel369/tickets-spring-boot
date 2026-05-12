package com.proyecto.tickets.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


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
    private Rol rol;
}
