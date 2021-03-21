package com.example.main.mappers;


import com.example.main.clases.Usuario;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MappersUser implements RowMapper<Usuario> {

    @Override
    public Usuario mapRow(ResultSet rs, int i) throws SQLException {
        Usuario usuario = new Usuario();
        usuario.setId(rs.getString(1));
        usuario.setNombre(rs.getString(2));
        usuario.setRut(rs.getString(3));
        usuario.setPass(rs.getString(4));
        usuario.setTipo(rs.getString(5));

        return usuario;
    }
}
