package com.example.animalcare.Clases;

import java.util.Date;

public class Registro_Leche extends Registro {

    private double Cantidad_Litros;

    public Registro_Leche(String animal, Date fecha_Creacion, String tipo, double cantidad_Litros) {
        super(animal, fecha_Creacion, tipo);
        Cantidad_Litros = cantidad_Litros;
    }

    public double getCantidad_Litros() {
        return Cantidad_Litros;
    }

    public void setCantidad_Litros(double cantidad_Litros) {
        Cantidad_Litros = cantidad_Litros;
    }
}
