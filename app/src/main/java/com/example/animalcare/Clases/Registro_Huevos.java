package com.example.animalcare.Clases;

import java.util.Date;

public class Registro_Huevos extends Registro {

 private int Cantidad_Huevos;

    public Registro_Huevos(String animal, Date fecha_Creacion, String tipo, int cantidad_Huevos) {
        super(animal, fecha_Creacion, tipo);
        Cantidad_Huevos = cantidad_Huevos;
    }

    public int getCantidad_Huevos() {
        return Cantidad_Huevos;
    }

    public void setCantidad_Huevos(int cantidad_Huevos) {
        Cantidad_Huevos = cantidad_Huevos;
    }
}
