package com.example.main.dao;


import com.example.main.clases.Contrato;
import com.example.main.clases.Empresa;
import com.example.main.mappers.MappersContrato;
import com.example.main.mappers.MappersEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DAOContrato {
    @Autowired
    private JdbcTemplate jdbc;

    //contratos por idempresa - contrato por idcontrato - editar estado

    public List<Contrato> getAllContratosporEmpresa(String idEmpresa){
        String sql = "SELECT * FROM contrato WHERE id_empresa = '"+idEmpresa+"';";
        try{
            List<Contrato> contratos = jdbc.query(sql, new MappersContrato());
            return contratos;
        }catch (Exception ex){
            return null;
        }
    }

    public List<Contrato> getAllContratosActivosPorEmpresa(String idEmpresa){
        String sql = "SELECT * FROM contrato WHERE id_empresa = '"+idEmpresa+"' AND estado = '1';";
        try{
            List<Contrato> contratos = jdbc.query(sql, new MappersContrato());
            return contratos;
        }catch (Exception ex){
            return null;
        }
    }

    public List<Contrato> getContratosCaducosPorEmpresa(String idEmpresa){
        String sql = "SELECT * FROM contrato WHERE id_empresa = '"+idEmpresa+"' AND estado = '0';";
        try {
            List<Contrato> contratos = jdbc.query(sql, new MappersContrato());
            return contratos;
        }catch (Exception ex){
            return null;
        }
    }

    public String getContratoForIdPasajero(String idPasajero){
        String sql = "SELECT c.id, c.codigo, c.id_empresa, c.nombre, c.idAdmin, c.fecha_inicio, c.fecha_fin, c.estado\n" +
                "FROM contrato c, contrato_pasajero\n" +
                "WHERE c.estado = 1 AND contrato_pasajero.id_pasajero = "+idPasajero;
        List<Contrato> contratos = jdbc.query(sql, new MappersContrato());
        try{
            String idContrato = contratos.get(0).getId();
            return idContrato;
        }catch (Exception exception){
            return null;
        }
    }

    public boolean existeCodigo(String codigo){
        String sql = "SELECT * FROM contrato WHERE codigo = "+codigo;

        List<Contrato> contratos = jdbc.query(sql,new MappersContrato());
        try{
            Contrato contrato = contratos.get(0);

            if(contrato != null){
                return true;
            }else{
                return false;
            }
        }catch (Exception exception){
            return false;
        }
    }

    public boolean insertContrato(Contrato c){
        String sql = "INSERT INTO contrato VALUES(NULL,UUID_SHORT(),'"+c.getIdEmpresa()+"','"+c.getNombre()+"','"+c.getIdAdmin()+"','"+c.getFechaInicio()+"','"+c.getFechaFin()+"','"+c.getEstado()+"');";
        System.out.println(sql);
        boolean ok = false;
        try {
            jdbc.update(sql);
            ok = true;
            System.out.println(ok);
            return ok;
        }catch (Exception exception){
            System.out.println(ok);
            System.out.println(exception.getMessage());
            return ok;
        }

    }


    public List<Contrato> getContratoForIDEmpresa(String idEmpresa){
        String sql = "SELECT contrato.id, contrato.codigo, contrato.nombre, contrato.idAdmin, contrato.fecha_inicio, contrato.fecha_fin, contrato.estado\n" +
                "FROM contrato\n" +
                "INNER JOIN empresa ON empresa.id = contrato.id_empresa\n" +
                "WHERE empresa.id = "+idEmpresa+" AND estado = 1;";

        try{
            List<Contrato> contratos = jdbc.query(sql, new MappersContrato());

            System.out.println(sql);

            return contratos;
        }catch (Exception exception){
            return null;
        }

    }

    @Async
    @Transactional
    public boolean updateContratoEstado(){
        String sql = "UPDATE contrato SET estado = 0 WHERE fecha_fin < CURDATE();";
        boolean ok = false;

        try{
            jdbc.update(sql);
            ok =  true;
            return ok;
        }catch (Exception exception){
            return ok;
        }
    }

    public Contrato getContratoPorCodigo(String codigo){
        String sql = "SELECT * FROM contrato WHERE codigo = "+codigo;

        List<Contrato> contratos = jdbc.query(sql,new MappersContrato());
        try {
            Contrato contrato = contratos.get(0);
            return contrato;
        }catch (Exception exception){
            return null;
        }
    }

    public boolean updateContrato(Contrato contrato){
        String sql = "UPDATE contrato SET fecha_inicio = '"+contrato.getFechaInicio()+"', fecha_fin = '"+contrato.getFechaFin()+"' WHERE id = '"+contrato.getId()+"';";
        boolean ok = false;

        try{
            jdbc.update(sql);
            ok =  true;
            return ok;
        }catch (Exception exception){
            return ok;
        }
    }

    public Contrato getContratoporId(String id){
        String sql = "SELECT contrato.id, contrato.codigo, empresa.nombre, contrato.nombre, contrato.idAdmin, contrato.fecha_inicio, contrato.fecha_fin, contrato.estado\n" +
                "FROM contrato\n" +
                "INNER JOIN empresa ON contrato.id_empresa = empresa.id\n" +
                "WHERE contrato.id = "+id+";";
        List<Contrato> contratos = jdbc.query(sql,new MappersContrato());
        try{
            Contrato contrato = contratos.get(0);
            return contrato;
        }catch (Exception exception){
            return null;
        }

    }

    public Contrato getContratoporCod(String codigo){
        String sql = "SELECT contrato.id, contrato.codigo, empresa.nombre, contrato.nombre, contrato.idAdmin, contrato.fecha_inicio, contrato.fecha_fin, contrato.estado\n" +
                "FROM contrato\n" +
                "INNER JOIN empresa ON contrato.id_empresa = empresa.id\n" +
                "WHERE contrato.codigo = "+codigo+";";
        List<Contrato> contratos = jdbc.query(sql,new MappersContrato());
        try{
            Contrato contrato = contratos.get(0);
            return contrato;
        }catch (Exception exception){
            return null;
        }
    }

    public Contrato getContratoVigenteForIDPasajero(String idPasajero){
        String sql = "SELECT contrato.id, contrato.codigo, contrato.id_empresa, contrato.nombre, contrato.idAdmin, contrato.fecha_inicio, contrato.fecha_fin, contrato.estado\n" +
                "FROM contrato_pasajero\n" +
                "INNER JOIN contrato ON contrato.id = contrato_pasajero.id_contrato\n" +
                "INNER JOIN pasajero ON pasajero.id =  contrato_pasajero.id_pasajero\n" +
                "WHERE pasajero.id = "+idPasajero+" AND contrato.estado = 1;";

        List<Contrato> contratos = jdbc.query(sql,new MappersContrato());
        try{
            Contrato contrato = contratos.get(0);
            return contrato;
        }catch (Exception exception){
            return null;
        }
    }

    public Contrato getContratoActivoForIDPasajeroANDIDEmpresa(String idPasajero, String idEmpresa){
        String sql = "SELECT contrato.id, contrato.codigo, contrato.id_empresa, contrato.nombre, contrato.idAdmin, contrato.fecha_inicio, contrato.fecha_fin, contrato.estado\n" +
                "FROM contrato_pasajero, pasajero, contrato\n" +
                "WHERE (pasajero.id = contrato_pasajero.id_pasajero AND contrato.id = contrato_pasajero.id_contrato)\n" +
                "AND pasajero.id = "+idPasajero+" AND contrato.id_empresa = "+idEmpresa+" AND contrato.estado = 1;";
        System.out.println(sql);
        List<Contrato> contratos = jdbc.query(sql,new MappersContrato());
        try{
            Contrato contrato = contratos.get(0);
            return contrato;
        }catch (Exception exception){
            return null;
        }
    }
}
