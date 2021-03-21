package com.example.main.dao;

import com.example.main.clases.Empresa;
import com.example.main.clases.EmpresaPasajero;
import com.example.main.mappers.MappersEmpresa;
import com.example.main.mappers.MappersEmpresaPasajero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DAOEmpresaPasajero {
    @Autowired
    private JdbcTemplate jdbc;

    public boolean insertEmpresaPasajero(EmpresaPasajero ep){
        String sql = "INSERT INTO empresa_pasajero VALUES(NULL,'"+ep.getIdEmpresa()+"','"+ep.getIdPasajero()+"');";
        boolean ok = false;
        try {
            jdbc.update(sql);
            ok = true;
            return ok;
        }catch (Exception exception){
            return ok;
        }

    }

    public EmpresaPasajero getEmpresaPasajeroFORIDPasajero(String id){
        String sql = "SELECT * FROM empresa_pasajero WHERE id_pasajero = '"+id+"' ORDER BY id DESC";
        System.out.println(sql);
        List<EmpresaPasajero> lista = jdbc.query(sql, new MappersEmpresaPasajero());
        try{
            EmpresaPasajero ep = lista.get(0);
            return ep;
        }catch (Exception exception){
            return null;
        }
    }

    public boolean updateEmpresaPasajero(String idPasajero, String idEmpresaNueva, String idEmpresaAntigua){
        String sql = "UPDATE empresa_pasajero SET id_empresa = '"+idEmpresaNueva+"' WHERE id_pasajero = '"+idPasajero+"' AND id_empresa = '"+idEmpresaAntigua+"';";
        boolean ok =  false;

        try{
            jdbc.update(sql);
            ok =  true;
            return ok;
        }catch (Exception exception){
            return ok;
        }

    }
}
