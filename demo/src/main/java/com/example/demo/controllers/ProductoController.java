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

import com.example.demo.models.ProductoModel;
import com.example.demo.services.ProductoServices;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    ProductoServices productoServices;

    @GetMapping()
    public ArrayList<ProductoModel> obtenerProductos(){
        return productoServices.obtenerProductos();
    }

    @PostMapping()
    public ProductoModel guardarProducto(@RequestBody ProductoModel producto){
        return this.productoServices.guardarProducto(producto);
    }

    @GetMapping(path = "/{id_producto}")
    public Optional<ProductoModel> obtenerClientePorId(@PathVariable("id_producto")Integer id_producto){
        return this.productoServices.obtenerPorId(id_producto);
    }
   
    


    
}



