package com.example.main.ws;

import com.example.main.clases.Usuario;
import com.example.main.dao.DAOUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    DAOUser daoUser;

    @GetMapping(value = "/usuario")
    public Usuario getUserForRut(
            @RequestParam(name = "rut", defaultValue = "null")String rut,
            @RequestParam(name = "pass", defaultValue = "null")String pass){
        return daoUser.getUsuario(rut,pass);
    }



}
