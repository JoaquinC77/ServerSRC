package com.example.main.clases;

public class Usuario {
    private String id;
    private String nombre;
    private String rut;
    private String pass;
    private String tipo;

    public Usuario(String id, String nombre, String rut, String pass, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.rut = rut;
        this.pass = pass;
        this.tipo = tipo;
    }

    public Usuario() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
