package com.backend.restfull.prueba.backend.controllers;

import java.util.List;

import com.backend.restfull.prueba.backend.model.entities.Cliente;
import com.backend.restfull.prueba.backend.model.services.IClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ClienteRestController {

    @Autowired
    private IClienteService clienteService;

    @GetMapping("/clientes")
    public List<Cliente> index(){
        return clienteService.findAll();
    }
    
}
