package com.example.main.dao;

import com.example.main.clases.Contrato;
import com.example.main.clases.EncargadoRepresentante;
import com.example.main.clases.Pasajero;
import com.example.main.mappers.MappersContrato;
import com.example.main.mappers.MappersPasajero;
import com.example.main.mappers.MappersRepresentante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DAOPasajero {
    @Autowired
    private JdbcTemplate jdbc;

    public Pasajero getPasajero(String id){
        String sql = "SELECT * FROM pasajero WHERE id = '"+id+"';";
        List<Pasajero> pasajeros = jdbc.query(sql, new MappersPasajero());
        try{
            Pasajero pasajero = pasajeros.get(0);
            return pasajero;
        }catch (Exception ex){
            return null;
        }
    }

    public Pasajero getPasajeroForRut(String rut){
        String sql = "SELECT * FROM pasajero WHERE rut = '"+rut+"';";
        List<Pasajero> pasajeros = jdbc.query(sql, new MappersPasajero());
        try{
            Pasajero pasajero = pasajeros.get(0);
            return pasajero;
        }catch (Exception ex){
            return null;
        }
    }

    public int getPasajerosAsignadosAContrato(String codigoContrato){
        String sql = "SELECT pasajero.id, pasajero.codigo, pasajero.nombre, pasajero.apellidoP, pasajero.apellidoM, pasajero.rut, pasajero.direccion\n" +
                "FROM pasajero, contrato, contrato_pasajero\n" +
                "WHERE pasajero.id = contrato_pasajero.id_pasajero\n" +
                "AND contrato.id = contrato_pasajero.id_contrato\n" +
                "AND contrato.codigo = "+codigoContrato+";";

        List<Pasajero> pasajeros = jdbc.query(sql,new MappersPasajero());
        try{
            if(pasajeros.isEmpty()){
                return 0;
            }else{
                return pasajeros.size();
            }
        }catch (Exception ex){
            System.out.println("ERROR DE CONSULTA "+ex.getLocalizedMessage());
            return 0;
        }


    }

    public List<Pasajero> getPasajeroPorAsosciacionContrato(String codigoContrato){
        String sql = "SELECT pasajero.id, pasajero.codigo, pasajero.nombre, pasajero.apellidoP, pasajero.apellidoM, pasajero.rut, pasajero.direccion\n" +
                "FROM pasajero, contrato, contrato_pasajero\n" +
                "WHERE pasajero.id = contrato_pasajero.id_pasajero\n" +
                "AND contrato.id = contrato_pasajero.id_contrato\n" +
                "AND contrato.codigo = '"+codigoContrato+"';";
        try{
            List<Pasajero> pasajeros = jdbc.query(sql, new MappersPasajero());
            return pasajeros;
        }catch (Exception e){
            return null;
        }
    }

    public boolean existeCodigo(String codigo){
        String sql = "SELECT * FROM pasajero WHERE codigo = "+codigo;

        List<Pasajero> pasajeros = jdbc.query(sql,new MappersPasajero());
        try{
            Pasajero pasajero = pasajeros.get(0);

            if(pasajero != null){
                return true;
            }else{
                return false;
            }
        }catch (Exception exception){
            return false;
        }
    }

    public Pasajero getPasajeroPorCodigo(String codigo){
        String sql = "SELECT * FROM pasajero WHERE codigo = "+codigo;

        List<Pasajero> pasajeros = jdbc.query(sql,new MappersPasajero());
        try{
            Pasajero pasajero = pasajeros.get(0);
            return pasajero;
        }catch (Exception ex){
            return null;
        }
    }

    public boolean insertPasajero(Pasajero pasajero){
        String sql = "INSERT INTO pasajero VALUES(NULL,UUID(),'"+pasajero.getNombre()+"','"+pasajero.getApellidoP()+"','"+pasajero.getApellidoM()+"','"+pasajero.getRut()+"','"+pasajero.getDireccion()+"');";
        boolean ok = false;
        try {
            jdbc.update(sql);
            ok = true;
            return ok;
        }catch (Exception exception){
            return ok;
        }

    }

}
