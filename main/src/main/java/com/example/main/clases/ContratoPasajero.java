package com.example.main.clases;

public class ContratoPasajero {
    private String id;
    private String idContrato;
    private String idPasajero;
    private String fechaEntrada;
    private String fechaSalida;

    public ContratoPasajero(String id, String idContrato, String idPasajero, String fechaEntrada, String fechaSalida) {
        this.id = id;
        this.idContrato = idContrato;
        this.idPasajero = idPasajero;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    public ContratoPasajero() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(String idContrato) {
        this.idContrato = idContrato;
    }

    public String getIdPasajero() {
        return idPasajero;
    }

    public void setIdPasajero(String idPasajero) {
        this.idPasajero = idPasajero;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
}
