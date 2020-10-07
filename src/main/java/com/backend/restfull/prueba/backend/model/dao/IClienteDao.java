package com.backend.restfull.prueba.backend.model.dao;

import com.backend.restfull.prueba.backend.model.entities.Cliente;

import org.springframework.data.repository.CrudRepository;

public interface IClienteDao extends CrudRepository<Cliente, Long> {
    
}
