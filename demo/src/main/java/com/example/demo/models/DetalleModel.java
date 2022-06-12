package com.example.demo.models;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "detalle")
public class DetalleModel {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer num_detalle;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_factura")
    private FacturaModel id_factura;

    private Integer cantidad;
    private Integer precio;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_producto")
    private ProductoModel id_producto;
    

    public Integer getNum_detalle() {
        return this.num_detalle;
    }

    public void setNum_detalle(Integer num_detalle) {
        this.num_detalle = num_detalle;
    }

    public FacturaModel getId_factura() {
        return this.id_factura;
    }

    public void setId_factura(FacturaModel id_factura) {
        this.id_factura = id_factura;
    }

    public Integer getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getPrecio() {
        return this.precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public ProductoModel getId_producto() {
        return this.id_producto;
    }

    public void setId_producto(ProductoModel id_producto) {
        this.id_producto = id_producto;
    }


}
