package com.example.animalcare.Clases;

public class Derivado_Animal {

    public String Nombre;
    private String Tipo;

    public Derivado_Animal(String nombre, String tipo) {
        Nombre = nombre;
        Tipo = tipo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }
}
