package com.example.animalcare.Clases;

import java.util.Date;

public class Animal {

    public String Nombre;
    private String Codigo;
    private String Tipo;
    private String Raza;
    private String Sexo;
    private Date Fecha_Nacimiento;

    public Animal(String nombre, String codigo, String tipo, String raza, String sexo, Date fecha_Nacimiento) {
        Nombre = nombre;
        Codigo = codigo;
        Tipo = tipo;
        Raza = raza;
        Sexo = sexo;
        Fecha_Nacimiento = fecha_Nacimiento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String raza) {
        Raza = raza;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    public Date getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(Date fecha_Nacimiento) {
        Fecha_Nacimiento = fecha_Nacimiento;
    }
}
