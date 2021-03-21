package com.example.main.mappers;

import com.example.main.clases.Contrato;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MappersContrato implements RowMapper<Contrato> {
    @Override
    public Contrato mapRow(ResultSet rs, int i) throws SQLException {
        Contrato contrato = new Contrato();
        contrato.setId(rs.getString(1));
        contrato.setCodigo(rs.getString(2));
        contrato.setIdEmpresa(rs.getString(3));
        contrato.setNombre(rs.getString(4));
        contrato.setIdAdmin(rs.getString(5));
        contrato.setFechaInicio(rs.getDate(6));
        contrato.setFechaFin(rs.getDate(7));
        contrato.setEstado(rs.getString(8));

        return contrato;


    }
}
