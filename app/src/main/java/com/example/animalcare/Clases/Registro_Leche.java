package com.example.animalcare.Clases;

import java.util.Date;

public class Registro_Leche extends Registro {

    private double cantidad_litros;

    public Registro_Leche(String animal, Date fecha_creacion, String tipo, double cantidad_litros) {
        super(animal, fecha_creacion, tipo);
        this.cantidad_litros = cantidad_litros;
    }

    public double getCantidad_litros() {
        return cantidad_litros;
    }

    public void setCantidad_litros(double cantidad_litros) {
        this.cantidad_litros = cantidad_litros;
    }
}
