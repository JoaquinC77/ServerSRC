package com.example.main.dao;


import com.example.main.clases.Contrato;
import com.example.main.clases.ContratoPasajero;
import com.example.main.mappers.MappersContrato;
import com.example.main.mappers.MappersContratoPasajero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DAOContratoPasajero {
    @Autowired
    private JdbcTemplate jdbc;


    public List<ContratoPasajero> getAllContratosForPasajero(String idPasajero){
        String sql = "SELECT * FROM contrato_pasajero WHERE id_pasajero = '"+idPasajero+"';";
        try{
            List<ContratoPasajero> contratos = jdbc.query(sql, new MappersContratoPasajero());
            return contratos;
        }catch (Exception ex){
            return null;
        }
    }

    public boolean insertContratoPasajero(ContratoPasajero cp){
        String sql = "INSERT INTO contrato_pasajero VALUES(NULL,'"+cp.getIdContrato()+"','"+cp.getIdPasajero()+"','"+cp.getFechaEntrada()+"','"+cp.getFechaSalida()+"');";
        boolean ok = false;
        try {
            jdbc.update(sql);
            ok = true;
            return ok;
        }catch (Exception exception){
            return ok;
        }

    }


}
