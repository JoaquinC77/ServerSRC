package com.example.main.clases;

public class Empresa {
    private String id;
    private String nombre;
    private String rut;
    private String direccion;
    private String idRepresentante;

    public Empresa(String id, String nombre, String rut, String direccion, String idRepresentante) {
        this.id = id;
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
        this.idRepresentante = idRepresentante;
    }

    public Empresa() {
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getIdRepresentante() {
        return idRepresentante;
    }

    public void setIdRepresentante(String idRepresentante) {
        this.idRepresentante = idRepresentante;
    }
}
