package com.example.main.clases;

public class RegistroServicio {
    private String id;
    private String idPasajero;
    private String idContrato;
    private String idServicio;
    private String fecha;

    public RegistroServicio(String id, String idPasajero, String idContrato, String idServicio,  String fecha) {
        this.id = id;
        this.idPasajero = idPasajero;
        this.idContrato = idContrato;
        this.idServicio = idServicio;
        this.fecha = fecha;
    }

    public RegistroServicio() {
    }

    public String getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(String idContrato) {
        this.idContrato = idContrato;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdPasajero() {
        return idPasajero;
    }

    public void setIdPasajero(String idPasajero) {
        this.idPasajero = idPasajero;
    }

    public String getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(String idServicio) {
        this.idServicio = idServicio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
