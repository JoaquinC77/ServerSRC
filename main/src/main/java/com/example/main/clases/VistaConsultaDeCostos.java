package com.example.main.clases;

public class VistaConsultaDeCostos {
    private String idEmpresa;
    private String idContrato;
    private String fechaInicio;
    private String fechaFin;
    private String cantidadTrabajadores;
    private String cantidadDesayunosServidos;
    private String valorDesayuno;
    private String totalDesayuno;
    private String cantidadAlmuerzoServidos;
    private String valorAlmuerzo;
    private String totalAlmuerzo;
    private String cantidadCenasServidas;
    private String valorCena;
    private String totalCenas;
    private String totalDeServiciosServidos;
    private String total;


    public VistaConsultaDeCostos(String idEmpresa, String idContrato, String fechaInicio, String fechaFin, String cantidadTrabajadores, String cantidadDesayunosServidos, String valorDesayuno, String totalDesayuno, String cantidadAlmuerzoServidos, String valorAlmuerzo, String totalAlmuerzo, String cantidadCenasServidas, String valorCena, String totalCenas, String totalDeServiciosServidos, String total) {
        this.idEmpresa = idEmpresa;
        this.idContrato = idContrato;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cantidadTrabajadores = cantidadTrabajadores;
        this.cantidadDesayunosServidos = cantidadDesayunosServidos;
        this.valorDesayuno = valorDesayuno;
        this.totalDesayuno = totalDesayuno;
        this.cantidadAlmuerzoServidos = cantidadAlmuerzoServidos;
        this.valorAlmuerzo = valorAlmuerzo;
        this.totalAlmuerzo = totalAlmuerzo;
        this.cantidadCenasServidas = cantidadCenasServidas;
        this.valorCena = valorCena;
        this.totalCenas = totalCenas;
        this.totalDeServiciosServidos = totalDeServiciosServidos;
        this.total = total;
    }

    public VistaConsultaDeCostos() {
    }

    public String getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(String idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(String idContrato) {
        this.idContrato = idContrato;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getCantidadTrabajadores() {
        return cantidadTrabajadores;
    }

    public void setCantidadTrabajadores(String cantidadTrabajadores) {
        this.cantidadTrabajadores = cantidadTrabajadores;
    }

    public String getCantidadDesayunosServidos() {
        return cantidadDesayunosServidos;
    }

    public void setCantidadDesayunosServidos(String cantidadDesayunosServidos) {
        this.cantidadDesayunosServidos = cantidadDesayunosServidos;
    }

    public String getValorDesayuno() {
        return valorDesayuno;
    }

    public void setValorDesayuno(String valorDesayuno) {
        this.valorDesayuno = valorDesayuno;
    }

    public String getTotalDesayuno() {
        return totalDesayuno;
    }

    public void setTotalDesayuno(String totalDesayuno) {
        this.totalDesayuno = totalDesayuno;
    }

    public String getCantidadAlmuerzoServidos() {
        return cantidadAlmuerzoServidos;
    }

    public void setCantidadAlmuerzoServidos(String cantidadAlmuerzoServidos) {
        this.cantidadAlmuerzoServidos = cantidadAlmuerzoServidos;
    }

    public String getValorAlmuerzo() {
        return valorAlmuerzo;
    }

    public void setValorAlmuerzo(String valorAlmuerzo) {
        this.valorAlmuerzo = valorAlmuerzo;
    }

    public String getTotalAlmuerzo() {
        return totalAlmuerzo;
    }

    public void setTotalAlmuerzo(String totalAlmuerzo) {
        this.totalAlmuerzo = totalAlmuerzo;
    }

    public String getCantidadCenasServidas() {
        return cantidadCenasServidas;
    }

    public void setCantidadCenasServidas(String cantidadCenasServidas) {
        this.cantidadCenasServidas = cantidadCenasServidas;
    }

    public String getValorCena() {
        return valorCena;
    }

    public void setValorCena(String valorCena) {
        this.valorCena = valorCena;
    }

    public String getTotalCenas() {
        return totalCenas;
    }

    public void setTotalCenas(String totalCenas) {
        this.totalCenas = totalCenas;
    }

    public String getTotalDeServiciosServidos() {
        return totalDeServiciosServidos;
    }

    public void setTotalDeServiciosServidos(String totalDeServiciosServidos) {
        this.totalDeServiciosServidos = totalDeServiciosServidos;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}
