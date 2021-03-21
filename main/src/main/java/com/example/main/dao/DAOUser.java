package com.example.main.dao;

import com.example.main.clases.Usuario;
import com.example.main.mappers.MappersUser;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class DAOUser {

    @Autowired
    private JdbcTemplate jdbc;

        public List<Usuario> getUserRutAndPass(String rut, String pass){
            String sql = "SELECT * FROM usuario WHERE pass = AES_ENCRYPT('"+pass+"','llave') AND rut = '"+rut+"';\n;";
            try{
                List<Usuario> usuarios = jdbc.query(sql,new MappersUser());
                return usuarios;
            }catch (Exception e){
                return null;
            }
        }

        public Usuario getUsuario(String rut, String pass){
            String sql = "SELECT * FROM usuario WHERE pass = AES_ENCRYPT('"+pass+"','llave') AND rut = '"+rut+"';\n;";
            try{
                List<Usuario> usuarios = jdbc.query(sql,new MappersUser());
                if(usuarios.get(0) != null){
                    Usuario usuario = usuarios.get(0);
                    return usuario;
                }else{
                    return null;
                }
            }catch (Exception exception){
                return null;
            }

        }
}
