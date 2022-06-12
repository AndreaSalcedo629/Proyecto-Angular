package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.FacturaModel;

@Repository
public interface FacturaRepository extends CrudRepository<FacturaModel, Integer>{
    
}
