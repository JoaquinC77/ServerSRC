package com.example.main.clases;

public class VistaContratoPasajero {
    private String id;
    private String nombreEmpresa;
    private String nombreContrato;
    private String fechaEntrada;
    private String fechaSalida;

    public VistaContratoPasajero(String id, String nombreEmpresa, String nombreContrato, String fechaEntrada, String fechaSalida) {
        this.id = id;
        this.nombreEmpresa = nombreEmpresa;
        this.nombreContrato = nombreContrato;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    public VistaContratoPasajero() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNombreContrato() {
        return nombreContrato;
    }

    public void setNombreContrato(String nombreContrato) {
        this.nombreContrato = nombreContrato;
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
