package com.backend.restfull.prueba.backend.model.services;

import java.util.List;

import com.backend.restfull.prueba.backend.model.entities.Cliente;

public interface IClienteService {
    public List<Cliente> findAll();
}
