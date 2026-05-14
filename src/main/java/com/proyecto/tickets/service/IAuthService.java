package com.proyecto.tickets.service;

import com.proyecto.tickets.dto.RegistrarseRequestDTO;
import com.proyecto.tickets.dto.RegistrarseResponseDTO;
import com.proyecto.tickets.dto.UsuarioRequestAuthDTO;
import com.proyecto.tickets.dto.UsuarioResponseAuthDTO;

public interface IAuthService  {

 RegistrarseResponseDTO registrarUsuario(RegistrarseRequestDTO registrarseRequest);

 RegistrarseResponseDTO registerAdmin(RegistrarseRequestDTO registerRequest);

 UsuarioResponseAuthDTO logearUsuario(UsuarioRequestAuthDTO usuarioLogeo);
}
