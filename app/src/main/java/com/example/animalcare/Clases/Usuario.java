package com.example.animalcare.Clases;

import java.util.Date;

public class Usuario {


    public String Nombre;
    private String Correo;
    private String Contraseña;
    private String Rol;

    public Usuario(String nombre, String correo, String contraseña, String rol) {
        Nombre = nombre;
        Correo = correo;
        Contraseña = contraseña;
        Rol = rol;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String rol) {
        Rol = rol;
    }
}
