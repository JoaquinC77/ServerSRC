package com.example.main.dao;

import com.example.main.clases.Empresa;
import com.example.main.clases.EncargadoRepresentante;
import com.example.main.mappers.MappersEmpresa;
import com.example.main.mappers.MappersRepresentante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DAOEncargadoRepresentante {
    @Autowired
    private JdbcTemplate jdbc;

    public EncargadoRepresentante getEncargado(String id){
        String sql = "SELECT * FROM encargado_representante WHERE id = '"+id+"';";
        try{
            List<EncargadoRepresentante> representantes = jdbc.query(sql, new MappersRepresentante());
            EncargadoRepresentante representante = representantes.get(0);
            return representante;
        }catch (Exception exception){
            return null;
        }
    }

    public EncargadoRepresentante getEncargadoForRut(String rut){
        String sql = "SELECT * FROM encargado_representante WHERE rut = '"+rut+"';";
        try{
            List<EncargadoRepresentante> representantes = jdbc.query(sql, new MappersRepresentante());
            EncargadoRepresentante representante = representantes.get(0);
            return representante;
        }catch (Exception e){
            return null;
        }
    }

    public EncargadoRepresentante getUltimoEncargado(){
        String sql = "SELECT * FROM encargado_representante WHERE id = (SELECT MAX(id) FROM encargado_representante);";
        try{
            List<EncargadoRepresentante> representantes = jdbc.query(sql, new MappersRepresentante());
            EncargadoRepresentante representante = representantes.get(0);
            return representante;
        }catch (Exception e){
            return null;
        }
    }

    public boolean insertEncargado(EncargadoRepresentante encargado){
        String sql = "INSERT INTO encargado_representante VALUES(NULL,'"+encargado.getNombre()+"','"+encargado.getRut()+"','"+encargado.getPuesto()+"','"+encargado.getTelefono()+"','"+encargado.getEmail()+"');";
        boolean ok = false;
        try {
            jdbc.update(sql);
            ok = true;
            return ok;
        }catch (Exception exception){
            return ok;
        }

    }

    //set puesto,telefono,email
    public boolean updateEncargado(EncargadoRepresentante encargado){
        String sql = "UPDATE encargado_representante SET puesto = '"+encargado.getPuesto()+"', telefono = '"+encargado.getTelefono()+"', email = '"+encargado.getEmail()+"' WHERE id = '"+encargado.getId()+"';";
            boolean ok = false;
        System.out.println(sql);

        try{
            jdbc.update(sql);
            ok =  true;
            return ok;
        }catch (Exception exception){
            return ok;
        }
    }



}
