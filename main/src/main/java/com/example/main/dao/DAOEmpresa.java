package com.example.main.dao;

import com.example.main.clases.Empresa;
import com.example.main.mappers.MappersEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DAOEmpresa {
    @Autowired
    private JdbcTemplate jdbc;

    public List<Empresa> getAllEmpresas(){
        String sql = "SELECT * FROM empresa ORDER BY nombre ASC;";
        try{
            List<Empresa> empresas = jdbc.query(sql, new MappersEmpresa());
            return empresas;
        }catch (Exception exception){
            return null;
        }
    }

    public Empresa getEmpresaForIDPasajero(String id){
        String sql = "select empresa.id, empresa.nombre, empresa.rut, empresa.direccion, empresa.idRepresentante\n" +
                "from empresa, pasajero, empresa_pasajero\n" +
                "where \n" +
                "(empresa.id = empresa_pasajero.id_empresa\n" +
                "and pasajero.id = empresa_pasajero.id_pasajero)\n" +
                "and empresa_pasajero.id = (select max(id) FROM empresa_pasajero WHERE id_pasajero  = '"+id+"');";

        System.out.println(sql);

        List<Empresa> empresas = jdbc.query(sql, new MappersEmpresa());
        try{
            Empresa empresa = empresas.get(0);
            return empresa;
        }catch (Exception exception){
            return null;
        }
    }

    public boolean insertEmpresa(Empresa e){
        String sql = "INSERT INTO empresa VALUES(NULL,'"+e.getNombre()+"','"+e.getRut()+"','"+e.getDireccion()+"','"+e.getIdRepresentante()+"');";
        boolean ok = false;
        try {
            jdbc.update(sql);
            ok = true;
            return ok;
        }catch (Exception exception){
            System.out.println(exception.getMessage());
            return ok;
        }

    }

    public boolean updateEmpresa(Empresa e){
        String sql = "UPDATE empresa SET nombre = '"+e.getNombre()+"', direccion = '"+e.getDireccion()+"' WHERE id = '"+e.getId()+"';";
        boolean ok = false;

        try{
            jdbc.update(sql);
            ok =  true;
            return ok;
        }catch (Exception exception){
            return ok;
        }
    }

    public Empresa getEmpresaForID(String id){
        String sql = "SELECT * FROM empresa WHERE id = "+id+";";
        List<Empresa> empresas = jdbc.query(sql,new MappersEmpresa());
        try{
            Empresa empresa = empresas.get(0);
            return empresa;
        }catch (Exception exception){
            return null;
        }
    }

    public Empresa getEmpresaForRUT(String rut){
        String sql = "SELECT * FROM empresa WHERE rut = '"+rut+"';";
        List<Empresa> empresas = jdbc.query(sql,new MappersEmpresa());
        try{
            Empresa empresa = empresas.get(0);
            return empresa;
        }catch (Exception exception){
            return null;
        }
    }
}
