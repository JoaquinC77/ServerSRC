package com.example.main.clases;

import java.sql.Time;

public class HorarioServicios {
    private String id;
    private String idServicio;
    private Time horaInicio;
    private Time horaFIn;

    public HorarioServicios(String id, String idServicio, Time horaInicio, Time horaFIn) {
        this.id = id;
        this.idServicio = idServicio;
        this.horaInicio = horaInicio;
        this.horaFIn = horaFIn;
    }

    public HorarioServicios() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(String idServicio) {
        this.idServicio = idServicio;
    }

    public Time getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Time getHoraFIn() {
        return horaFIn;
    }

    public void setHoraFIn(Time horaFIn) {
        this.horaFIn = horaFIn;
    }
}
