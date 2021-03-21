package com.example.main.clases;

public class VistaRegistrosServiciosDetalle {
    private String nombrePasajero;
    private String apellidoPasajero;
    private String idContrato;
    private String servicio;
    private String fecha;

    public VistaRegistrosServiciosDetalle(String nombrePasajero, String apellidoPasajero, String idContrato, String servicio, String fecha) {
        this.nombrePasajero = nombrePasajero;
        this.apellidoPasajero = apellidoPasajero;
        this.idContrato = idContrato;
        this.servicio = servicio;
        this.fecha = fecha;
    }

    public VistaRegistrosServiciosDetalle() {
    }

    public String getNombrePasajero() {
        return nombrePasajero;
    }

    public void setNombrePasajero(String nombrePasajero) {
        this.nombrePasajero = nombrePasajero;
    }

    public String getApellidoPasajero() {
        return apellidoPasajero;
    }

    public void setApellidoPasajero(String apellidoPasajero) {
        this.apellidoPasajero = apellidoPasajero;
    }

    public String getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(String idContrato) {
        this.idContrato = idContrato;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
