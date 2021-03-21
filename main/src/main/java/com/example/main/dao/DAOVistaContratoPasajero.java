package com.example.main.dao;


import com.example.main.clases.VistaContratoPasajero;
import com.example.main.mappers.MappersVistaContratosPasajero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DAOVistaContratoPasajero {
    @Autowired
    private JdbcTemplate jdbc;

    public List<VistaContratoPasajero> getVistaContrato(String idPasajero){
        String sql = "SELECT cp.id, e.nombre, c.nombre, cp.fecha_entrada, cp.fecha_salida\n" +
                "                FROM contrato_pasajero cp , empresa e, pasajero p, contrato c\n" +
                "                WHERE contrato_pasajero.id_pasajero = pasajero.id\n" +
                "                AND contrato_pasajero.id_contrato = contrato.id\n" +
                "                AND contrato.id_empresa = empresa.id\n" +
                "                AND pasajero.id = "+idPasajero;

        try{
            List<VistaContratoPasajero> vistas = jdbc.query(sql, new MappersVistaContratosPasajero());
            return vistas;
        }catch (Exception e){
            return null;
        }
    }
}
