package com.example.demo.models;

import java.sql.Date;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.*;

//import org.springframework.beans.factory.annotation.Autowired;

//import com.example.demo.repositories.ClienteRepository;
//import com.example.demo.services.ClienteServices;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "factura")
public class FacturaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer num_factura;
    
    private Date fecha;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cliente")
    private ClienteModel id_cliente;


 


    public FacturaModel(ClienteModel id_cliente) {
        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm");
        Integer rand = (int)Math.random();
       this.num_factura = rand;
      this.fecha = Date.valueOf(dtf5.format(LocalDateTime.now()));
        this.id_cliente = id_cliente;
    }



    public Integer getNum_factura() {
        return this.num_factura;
    }

    public void setNum_factura(Integer num_factura) {
        this.num_factura = num_factura;
    }

    public ClienteModel getId_cliente() {
        return this.id_cliente;
    }

    public void setId_cliente(ClienteModel id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    

}
