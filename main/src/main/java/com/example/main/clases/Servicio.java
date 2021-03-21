package com.example.main.clases;

public class Servicio {
    private String id;
    private String nombre;
    private int Valor;

    public Servicio(String id, String nombre, int valor) {
        this.id = id;
        this.nombre = nombre;
        Valor = valor;
    }

    public Servicio() {
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

    public int getValor() {
        return Valor;
    }

    public void setValor(int valor) {
        Valor = valor;
    }
}
