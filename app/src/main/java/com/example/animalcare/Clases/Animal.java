package com.example.animalcare.Clases;

import java.util.Date;

public class Animal {

    public String nombre;
    private String codigo;
    private String tipo;
    private String raza;
    private String sexo;
    private Date fecha_nacimiento;

    public Animal(String nombre, String codigo, String tipo, String raza, String sexo, Date fecha_nacimiento) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.tipo = tipo;
        this.raza = raza;
        this.sexo = sexo;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
}
