package com.example.main.mappers;

import com.example.main.clases.ContratoPasajero;
import com.example.main.clases.Empresa;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MappersContratoPasajero implements RowMapper<ContratoPasajero> {
    @Override
    public ContratoPasajero mapRow(ResultSet rs, int i) throws SQLException {
        ContratoPasajero contratoPasajero = new ContratoPasajero();
        contratoPasajero.setId(rs.getString(1));
        contratoPasajero.setIdContrato(rs.getString(2));
        contratoPasajero.setIdPasajero(rs.getString(3));
        contratoPasajero.setFechaEntrada(rs.getString(4));
        contratoPasajero.setFechaSalida(rs.getString(5));


        return contratoPasajero;
    }
}
