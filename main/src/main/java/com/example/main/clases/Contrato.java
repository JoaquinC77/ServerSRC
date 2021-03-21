package com.example.main.clases;

import java.sql.Date;

public class Contrato {
    private String id;
    private String codigo;
    private String idEmpresa;
    private String nombre;
    private String idAdmin;
    private Date fechaInicio;
    private Date fechaFin;
    private String estado;

    public Contrato(String id, String codigo, String idEmpresa, String nombre, String idAdmin, Date fechaInicio, Date fechaFin, String estado) {
        this.id = id;
        this.codigo = codigo;
        this.idEmpresa = idEmpresa;
        this.nombre = nombre;
        this.idAdmin = idAdmin;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
    }

    public Contrato() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(String idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(String idAdmin) {
        this.idAdmin = idAdmin;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
