package com.example.demo.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.ClienteModel;

@Repository
public interface ClienteRepository extends CrudRepository<ClienteModel, Integer>{
 
}
