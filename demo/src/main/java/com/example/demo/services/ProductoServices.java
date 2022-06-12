package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.ProductoModel;
import com.example.demo.repositories.ProductoRepository;

@Service
public class ProductoServices {
    @Autowired
    ProductoRepository productoRepository;

    public ArrayList<ProductoModel> obtenerProductos(){
        return (ArrayList<ProductoModel>)productoRepository.findAll();
    }

    public ProductoModel guardarProducto(ProductoModel producto){
        return productoRepository.save(producto);
    }

    public Optional<ProductoModel> obtenerPorId(Integer id_producto){
        return productoRepository.findById(id_producto);
    }

    public int precio(Integer id_producto){
        return  (productoRepository.findById(id_producto).get().getPrecio());
    }
}
