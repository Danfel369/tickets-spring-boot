package com.proyecto.tickets.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "usuarios")
@AllArgsConstructor
@Data
@Builder
@NoArgsConstructor
public class Usuario {
    @Id
    private ObjectId usuarioId;
    private String nombre;
    private String apellido;
    private String correo;
    private String fotoPerfil;
}
