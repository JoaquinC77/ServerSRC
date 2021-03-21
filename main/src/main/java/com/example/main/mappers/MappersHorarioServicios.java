package com.example.main.mappers;

import com.example.main.clases.HorarioServicios;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MappersHorarioServicios implements RowMapper<HorarioServicios> {

    @Override
    public HorarioServicios mapRow(ResultSet rs, int i) throws SQLException {
        HorarioServicios hs = new HorarioServicios();
        hs.setId(rs.getString(1));
        hs.setIdServicio(rs.getString(2));
        hs.setHoraInicio(rs.getTime(3));
        hs.setHoraFIn(rs.getTime(4));

        return hs;
    }
}
