package com.example.animalcare.Clases;

import java.util.Date;

public class Registro {
    private String animal;
    private Date fecha_creacion;
    private String tipo;

    public Registro(String animal, Date fecha_creacion, String tipo) {
        this.animal = animal;
        this.fecha_creacion = fecha_creacion;
        this.tipo = tipo;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

