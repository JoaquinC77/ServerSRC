package com.example.main.mappers;

import com.example.main.clases.Pasajero;
import com.example.main.clases.Servicio;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MappersServicio implements RowMapper<Servicio> {
    @Override
    public Servicio mapRow(ResultSet rs, int i) throws SQLException {
        Servicio servicio = new Servicio();
        servicio.setId(rs.getString(1));
        servicio.setNombre(rs.getString(2));
        servicio.setValor(rs.getInt(3));

        return servicio;
    }
}
