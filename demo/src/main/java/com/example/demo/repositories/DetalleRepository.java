package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.DetalleModel;

@Repository
public interface DetalleRepository extends CrudRepository<DetalleModel, Integer> {
    
}
