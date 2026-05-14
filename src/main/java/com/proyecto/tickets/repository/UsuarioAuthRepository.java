package com.proyecto.tickets.repository;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.proyecto.tickets.model.UsuarioAuth;

public interface UsuarioAuthRepository extends MongoRepository<UsuarioAuth, ObjectId> {
    
    Optional<UsuarioAuth> findByUser(String nameUser); 

    Boolean existByUserName(String nameUSer);
}