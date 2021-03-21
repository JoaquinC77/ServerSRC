package com.example.main.dao;

import com.example.main.clases.CambioDeServicio;
import com.example.main.mappers.MappersCambioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DAOCambioServicio {
    @Autowired
    private JdbcTemplate jdbc;

    //aqui vamos a sacar el servicio Actual;

    public int servicioActual(){
        String sql = "SELECT estado FROM cambioServicio";

        List<CambioDeServicio> lista = jdbc.query(sql, new MappersCambioServicio());
        int servicio = lista.get(0).getServicioActual();

        return servicio;
    }

    public int cambioservicioautomatico(){
        String sql = "call cambio_servicios_automatico(now());";
        List<CambioDeServicio> lista = jdbc.query(sql, new MappersCambioServicio());
        // donde servicioA = servicio actualizado
        int servicioA = lista.get(0).getServicioActual();

        return servicioA;
    }
}
