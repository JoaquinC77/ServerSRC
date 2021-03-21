package com.example.main.mappers;

import com.example.main.clases.VistaRegistrosServiciosDetalle;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MappersVistaRegistroServicioDetallado implements RowMapper<VistaRegistrosServiciosDetalle> {
    @Override
    public VistaRegistrosServiciosDetalle mapRow(ResultSet rs, int i) throws SQLException {
        VistaRegistrosServiciosDetalle vista = new VistaRegistrosServiciosDetalle();
        vista.setNombrePasajero(rs.getString(1));
        vista.setApellidoPasajero(rs.getString(2));
        vista.setIdContrato(rs.getString(3));
        vista.setServicio(rs.getString(4));
        vista.setFecha(rs.getString(5));

        return vista;

    }
}
