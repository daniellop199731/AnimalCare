package com.example.animalcare.Clases;

import java.util.Date;

public class Registro_Huevos extends Registro {

 private int cantidad_huevos;

    public Registro_Huevos(String animal, Date fecha_creacion, String tipo, int cantidad_huevos) {
        super(animal, fecha_creacion, tipo);
        this.cantidad_huevos = cantidad_huevos;
    }

    public int getCantidad_huevos() {
        return cantidad_huevos;
    }

    public void setCantidad_huevos(int cantidad_huevos) {
        this.cantidad_huevos = cantidad_huevos;
    }
}
