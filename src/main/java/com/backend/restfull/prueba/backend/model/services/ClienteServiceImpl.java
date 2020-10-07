package com.backend.restfull.prueba.backend.model.services;

import java.util.List;

import com.backend.restfull.prueba.backend.model.dao.IClienteDao;
import com.backend.restfull.prueba.backend.model.entities.Cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteServiceImpl implements IClienteService {

    @Autowired
    private IClienteDao clienteDao;

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> findAll() {
        // TODO Auto-generated method stub
        return (List<Cliente>) clienteDao.findAll();
    }
    
}
