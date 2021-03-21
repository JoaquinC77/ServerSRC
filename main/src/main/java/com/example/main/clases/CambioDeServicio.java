package com.example.main.clases;

public class CambioDeServicio {
    private int servicioActual;

    public CambioDeServicio(int servicioActual) {
        this.servicioActual = servicioActual;
    }

    public CambioDeServicio() {
    }

    public int getServicioActual() {
        return servicioActual;
    }

    public void setServicioActual(int servicioActual) {
        this.servicioActual = servicioActual;
    }
}
