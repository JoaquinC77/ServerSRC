package com.example.main.clases;

public class EncargadoRepresentante {
    private String id;
    private String nombre;
    private String rut;
    private String puesto;
    private String telefono;
    private String email;

    public EncargadoRepresentante(String id, String nombre, String rut, String puesto, String telefono, String email) {
        this.id = id;
        this.nombre = nombre;
        this.rut = rut;
        this.puesto = puesto;
        this.telefono = telefono;
        this.email = email;
    }

    public EncargadoRepresentante() {
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

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
