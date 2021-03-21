package com.example.main.dao;

import com.example.main.clases.VistaConsultaDeCostos;
import com.example.main.mappers.MapperVistaConsultaCostos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DAOVistaConsultaCostos {
    @Autowired
    JdbcTemplate jdbc;

    public VistaConsultaDeCostos getCostosPorContrato(String codigo, String fechaDesde, String fechaHasta){
        String sql = "call detallesCosteoPorContrato('"+codigo+"', '"+fechaDesde+"', '"+fechaHasta+"');";
        try{
            List<VistaConsultaDeCostos> vistas = jdbc.query(sql, new MapperVistaConsultaCostos());
            VistaConsultaDeCostos vista = vistas.get(0);
            return vista;
        }catch (Exception exception){
            return null;
        }
    }
}
