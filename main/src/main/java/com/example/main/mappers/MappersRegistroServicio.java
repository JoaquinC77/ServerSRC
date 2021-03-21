package com.example.main.mappers;

import com.example.main.clases.RegistroServicio;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MappersRegistroServicio implements RowMapper<RegistroServicio> {
    @Override
    public RegistroServicio mapRow(ResultSet rs, int i) throws SQLException {
        RegistroServicio regservicio = new RegistroServicio();
        regservicio.setId(rs.getString(1));
        regservicio.setIdPasajero(rs.getString(2));
        regservicio.setIdContrato(rs.getString(3));
        regservicio.setIdServicio(rs.getString(4));
        regservicio.setFecha(rs.getString(5));

        return regservicio;
    }
}
