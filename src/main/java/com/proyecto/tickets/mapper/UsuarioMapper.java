package com.proyecto.tickets.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.proyecto.tickets.dto.UsuarioRequestAuthDTO;
import com.proyecto.tickets.dto.UsuarioResponseAuthDTO;
import com.proyecto.tickets.dto.UsuariosResponseDTO;
import com.proyecto.tickets.model.Usuario;
import com.proyecto.tickets.model.UsuarioAuth;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    @Mapping(target = "nombre", source = "usuario.nombre")
    @Mapping(target = "apellido", source = "usuario.apellido")
    @Mapping(target = "email", source = "usuario.correo")
    @Mapping(target = "userName", source = "usuarioAuth.nameUser")
    @Mapping(target = "role", source = "usuarioAuth.rol")
    UsuarioResponseAuthDTO toDto(Usuario usuario, UsuarioAuth usuarioAuth);

    @Mapping(target = "nombre", source = "nombreUsuario")
    @Mapping(target = "apellido", source = "nombreUsuario")
    @Mapping(target = "correo", source = "nombreUsuario")
    Usuario toUsuario(UsuarioRequestAuthDTO usuarioRequestAuthDTO);

    @Mapping(target = "nameUser", source = "nombreUsuario")
    @Mapping(target = "passUser", source = "contrasenaUsuario")
    UsuarioAuth toUsuarioAuth(UsuarioRequestAuthDTO usuarioRequestAuthDTO);

    @Mapping(target = "nombre", source = "usuario.nombre")
    @Mapping(target = "apellido", source = "usuario.apellido")
    @Mapping(target = "email", source = "usuario.correo")
    @Mapping(target = "userName", source = "usuarioAuth.nameUser")
    @Mapping(target = "role", source = "usuarioAuth.rol")
    UsuariosResponseDTO toUsuarioResponseDTO(Usuario usuario, UsuarioAuth usuarioAuth);

}
