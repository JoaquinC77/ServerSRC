package com.example.main.dao;

import com.example.main.clases.VistaRegistrosServiciosDetalle;
import com.example.main.mappers.MappersVistaRegistroServicioDetallado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DAOVistaRegistroServiciosDetallado {
    @Autowired
    JdbcTemplate jdbc;

    public List<VistaRegistrosServiciosDetalle> getDetalleRegistrosPorContrato(String idContrato, String fechaDesde, String fechaHasta){
        String sql = "SELECT * FROM vista_registros WHERE id = '"+idContrato+"' and fecha between '"+fechaDesde+"' and '"+fechaHasta+"';";
        List<VistaRegistrosServiciosDetalle> lista =  jdbc.query(sql,new MappersVistaRegistroServicioDetallado());

        try{
            if(lista.get(0) != null){
                return lista;
            }else{
                return null;
            }
        }catch (Exception ex){
            return null;
        }

    }
}
