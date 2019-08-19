package com.example.animalcare.Clases;

import java.util.Date;

public class Registro {
    private String Animal;
    private Date Fecha_Creacion;
    private String Tipo;

    public Registro(String animal, Date fecha_Creacion, String tipo) {
        Animal = animal;
        Fecha_Creacion = fecha_Creacion;
        Tipo = tipo;
    }

    public String getAnimal() {
        return Animal;
    }

    public void setAnimal(String animal) {
        Animal = animal;
    }

    public Date getFecha_Creacion() {
        return Fecha_Creacion;
    }

    public void setFecha_Creacion(Date fecha_Creacion) {
        Fecha_Creacion = fecha_Creacion;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }
}

