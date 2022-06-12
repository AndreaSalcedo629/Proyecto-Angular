package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.ClienteModel;
import com.example.demo.services.ClienteServices;

@RestController
@CrossOrigin(origins = "http://localhost:4200/", methods= {RequestMethod.GET,RequestMethod.POST})

@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    ClienteServices clienteServices;

    @GetMapping()
    public ArrayList<ClienteModel> obtenerClientes(){
        return clienteServices.obtenerClientes();
    }

    @PostMapping()
    public ClienteModel guardarCliente(@RequestBody ClienteModel cliente){
        return this.clienteServices.guardarCliente(cliente);
    }

    @GetMapping(path = "/{id_cliente}")
    public Optional<ClienteModel> obtenerClientePorId(@PathVariable("id_cliente")Integer id_cliente){
        return this.clienteServices.obtenerPorId(id_cliente);
    }

}
