package com.example.main.mappers;

import com.example.main.clases.EncargadoRepresentante;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MappersRepresentante implements RowMapper<EncargadoRepresentante> {
    @Override
    public EncargadoRepresentante mapRow(ResultSet rs, int i) throws SQLException {
        EncargadoRepresentante repre = new EncargadoRepresentante();
        repre.setId(rs.getString(1));
        repre.setNombre(rs.getString(2));
        repre.setRut(rs.getString(3));
        repre.setPuesto(rs.getString(4));
        repre.setTelefono(rs.getString(5));
        repre.setEmail(rs.getString(6));

        return repre;
    }
}
