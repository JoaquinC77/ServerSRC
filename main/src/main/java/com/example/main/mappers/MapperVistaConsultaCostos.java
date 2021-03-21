package com.example.main.mappers;

import com.example.main.clases.VistaConsultaDeCostos;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MapperVistaConsultaCostos implements RowMapper<VistaConsultaDeCostos> {
    @Override
    public VistaConsultaDeCostos mapRow(ResultSet rs, int i) throws SQLException {
        VistaConsultaDeCostos vista = new VistaConsultaDeCostos();
        vista.setIdEmpresa(rs.getString(1));
        vista.setIdContrato(rs.getString(2));

        vista.setFechaInicio(rs.getString(3));
        vista.setFechaFin(rs.getString(4));

        vista.setCantidadTrabajadores(rs.getString(5));
        vista.setCantidadDesayunosServidos(rs.getString(6));

        vista.setValorDesayuno(rs.getString(7));
        vista.setTotalDesayuno(rs.getString(8));

        vista.setCantidadAlmuerzoServidos(rs.getString(9));
        vista.setValorAlmuerzo(rs.getString(10));

        vista.setTotalAlmuerzo(rs.getString(11));
        vista.setCantidadCenasServidas(rs.getString(12));
        vista.setValorCena(rs.getString(13));

        vista.setTotalCenas(rs.getString(14));
        vista.setTotalDeServiciosServidos(rs.getString(15));
        vista.setTotal(rs.getString(16));

        return vista;
    }
}
