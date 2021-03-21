package com.example.main.mappers;

import com.example.main.clases.Contrato;
import com.example.main.clases.Pasajero;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MappersPasajero implements RowMapper<Pasajero> {
    @Override
    public Pasajero mapRow(ResultSet rs, int i) throws SQLException {
        Pasajero pasajero = new Pasajero();
        pasajero.setId(rs.getString(1));
        pasajero.setCodigo(rs.getString(2));
        pasajero.setNombre(rs.getString(3));
        pasajero.setApellidoP(rs.getString(4));
        pasajero.setApellidoM(rs.getString(5));
        pasajero.setRut(rs.getString(6));
        pasajero.setDireccion(rs.getString(7));

        return pasajero;
    }
}
