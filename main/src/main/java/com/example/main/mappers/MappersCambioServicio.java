package com.example.main.mappers;

import com.example.main.clases.CambioDeServicio;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MappersCambioServicio implements RowMapper<CambioDeServicio> {
    @Override
    public CambioDeServicio mapRow(ResultSet rs, int i) throws SQLException {
        CambioDeServicio cds = new CambioDeServicio();
        cds.setServicioActual(rs.getInt(1));

        return cds;
    }
}
