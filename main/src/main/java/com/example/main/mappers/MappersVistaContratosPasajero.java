package com.example.main.mappers;

import com.example.main.clases.VistaContratoPasajero;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MappersVistaContratosPasajero implements RowMapper<VistaContratoPasajero> {

    @Override
    public VistaContratoPasajero mapRow(ResultSet rs, int i) throws SQLException {
        VistaContratoPasajero vista = new VistaContratoPasajero();
        vista.setId(rs.getString(1));
        vista.setNombreEmpresa(rs.getString(2));
        vista.setNombreContrato(rs.getString(3));
        vista.setFechaEntrada(rs.getString(4));
        vista.setFechaSalida(rs.getString(5));
        return vista;
    }
}
