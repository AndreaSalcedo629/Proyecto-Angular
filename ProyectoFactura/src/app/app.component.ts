
import { HttpClient } from '@angular/common/http';
import { MatDialog, MatDialogRef } from '@angular/material/dialog';
import { OnInit, OnChanges } from '@angular/core';


import { Component, ViewChild } from '@angular/core';
import { MatSelect } from '@angular/material/select';

import { DatePipe } from '@angular/common';

import axios from 'axios';
import { Route } from '@angular/router'

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})


export class AppComponent {
  title = 'GENERAR FACTURA';

  selected: "";
  selected1: "";
  cantidad: "";
  precio: number;
  nombre: ""

  currencies = [{ "id_cliente": 7227893, "nombre": "Carlos", "apellido": "Jimenez Sanchez", "direccion": "Calle 12-17 66", "fecha_nacimiento": "1985-05-03", "telefono": "3208345699", "email": "carlosjimenez@gmail.com" }];
  currencies1 = [{ "id_producto": 101, "nombre": "Pantalon Luciana", "precio": 72000, "stock": 10 }];


  getAxiosData() {
    var api = "http://localhost:8081/cliente/";
    var api1 = "http://localhost:8081/producto/";
    axios.get(api)
      .then((response) => {
        this.currencies = response.data
      })

    axios.get(api1)
      .then((response) => {
        this.currencies1 = response.data
      })

  }


  crearfactura() {
    axios.post('http://localhost:8081/', {
      idCliente: this.selected,
      nombre: this.selected,
      idProducto: this.selected1,
      cantidad: this.cantidad,
      precio: this.calcular()

    })
      .then(function (response) {
        console.log(response);
      })
      .catch(function (error) {
        console.log(error);
      });
  }

  crearFac() {
    document.createElement("table");
  }


  calcular() {

    axios.get('http://localhost:8081/producto/' + this.selected1, {

    })
      .then((response) => {
        this.precio = parseInt(this.cantidad) * parseInt(response.data.precio)
      })
      .catch(function (error) {
        console.log(error);
      });
  }




  ngOnInit() {
    this.precio = 0
    this.getAxiosData()
    console.log("llega")

  }







}






