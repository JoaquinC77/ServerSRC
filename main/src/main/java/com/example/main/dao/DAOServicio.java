package com.example.main.dao;

import com.example.main.clases.Pasajero;
import com.example.main.clases.Servicio;
import com.example.main.mappers.MappersPasajero;
import com.example.main.mappers.MappersServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DAOServicio {
    @Autowired
    private JdbcTemplate jdbc;

    public List<Servicio> getAllServicios(){
        String sql = "SELECT * FROM servicio;";
        try{
            List<Servicio> servicios = jdbc.query(sql, new MappersServicio());
            return servicios;
        }catch (Exception e){
            return null;
        }
    }

    public Servicio getServicioForId(String id){
        String sql = "SELECT * FROM servicio WHERE id = '"+id+"';";
        try {
            List<Servicio> servicios = jdbc.query(sql, new MappersServicio());
            Servicio servicio = servicios.get(0);
            return servicio;
        }catch (Exception e){
            return null;
        }
    }

}
