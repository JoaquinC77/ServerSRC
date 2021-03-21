package com.example.main.mappers;

import com.example.main.clases.EmpresaPasajero;
import com.example.main.clases.Pasajero;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MappersEmpresaPasajero implements RowMapper<EmpresaPasajero> {
    @Override
    public EmpresaPasajero mapRow(ResultSet rs, int i) throws SQLException {
        EmpresaPasajero empresaPasajero = new EmpresaPasajero();
        empresaPasajero.setId(rs.getString(1));
        empresaPasajero.setIdEmpresa(rs.getString(2));
        empresaPasajero.setIdPasajero(rs.getString(3));

        return empresaPasajero;
    }
}
