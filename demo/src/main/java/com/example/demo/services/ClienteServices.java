package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.ClienteModel;
import com.example.demo.repositories.ClienteRepository;

@Service
public class ClienteServices {
    @Autowired
    ClienteRepository clienteRepository;

    public ArrayList<ClienteModel> obtenerClientes(){
        return (ArrayList<ClienteModel>)clienteRepository.findAll();
    }

    public ClienteModel guardarCliente(ClienteModel cliente){
        return clienteRepository.save(cliente);
    }

    public Optional<ClienteModel> obtenerPorId(Integer id_cliente){
        return clienteRepository.findById(id_cliente);
    }

    public ClienteModel cliente(int id_cliente){
        return clienteRepository.findById(id_cliente).get();
    }

}
