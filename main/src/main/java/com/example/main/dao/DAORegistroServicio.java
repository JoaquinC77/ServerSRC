package com.example.main.dao;


import com.example.main.clases.Pasajero;
import com.example.main.clases.RegistroServicio;
import com.example.main.mappers.MappersPasajero;
import com.example.main.mappers.MappersRegistroServicio;
import jdk.swing.interop.SwingInterOpUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DAORegistroServicio {
    @Autowired
    private JdbcTemplate jdbc;

    public boolean insertRegistroServicio(RegistroServicio registro){
        String sql = "INSERT INTO registro_servicio VALUES" +
                "(NULL,'"+registro.getIdPasajero()+"','"+registro.getIdContrato()+"'," +
                "'"+registro.getIdServicio()+"',NOW());";

        boolean ok = false;
        try {
            jdbc.update(sql);
            ok = true;
            return ok;
        }catch (Exception exception){
            return ok;
        }

    }

    public boolean getValidacionRegistroExistente(RegistroServicio registro){
        String sql = "SELECT registro_servicio.id, registro_servicio.id_pasajero, registro_servicio.id_contrato,\n" +
                "registro_servicio.id_servicio, registro_servicio.fecha\n" +
                "FROM registro_servicio, contrato\n" +
                "WHERE CAST(registro_servicio.fecha as DATE) = CURDATE()\n" +
                "AND registro_servicio.id_pasajero = '"+registro.getIdPasajero()+"' AND registro_servicio.id_servicio = '"+registro.getIdServicio()+"' \n" +
                "AND registro_servicio.id_contrato = contrato.id AND contrato.estado = '1';";

        List<RegistroServicio> lista = jdbc.query(sql,new MappersRegistroServicio());
        try{
            if(lista.isEmpty()){
                System.out.println("vaciaaa");
                return false;
            }else{
                System.out.println("no vacia");
                return true;
            }

        }catch (Exception ex){
            System.out.printf("se cayooo"+ ex.getLocalizedMessage());
            return false;
        }

    }


    public List<RegistroServicio> getRegistrosPorPasajeroYContrato(String idPasajero, String idContrato){
        String sql = "SELECT * FROM registro_servicio\n" +
                "WHERE id_pasajero = "+idPasajero+" AND id_contrato = "+idContrato+";";
        try {
            List<RegistroServicio> lista = jdbc.query(sql, new MappersRegistroServicio());
            return lista;
        }catch (Exception ex){
            return null;
        }
    }


}
