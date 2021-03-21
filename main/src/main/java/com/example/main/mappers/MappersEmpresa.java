package com.example.main.mappers;

import com.example.main.clases.Empresa;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MappersEmpresa implements RowMapper<Empresa> {
    @Override
    public Empresa mapRow(ResultSet rs, int i) throws SQLException {
        Empresa e = new Empresa();
        e.setId(rs.getString(1));
        e.setNombre(rs.getString(2));
        e.setRut(rs.getString(3));
        e.setDireccion(rs.getString(4));
        e.setIdRepresentante(rs.getString(5));


        return e;
    }
}
