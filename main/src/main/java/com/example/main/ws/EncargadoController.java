package com.example.main.ws;

import com.example.main.clases.Contrato;
import com.example.main.clases.EncargadoRepresentante;
import com.example.main.dao.DAOEncargadoRepresentante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EncargadoController {
    @Autowired
    DAOEncargadoRepresentante daoER;

    @GetMapping(value = "/encargadoPorId")
    public EncargadoRepresentante getEncargadoPorId(@RequestParam(name = "id", defaultValue = "-1") String id){
        return daoER.getEncargado(id);
    }

    @GetMapping(value = "/encargadoPorRut")
    public EncargadoRepresentante getEncargadoPorRut(@RequestParam(name = "rut", defaultValue = "-1") String rut){
        return daoER.getEncargadoForRut(rut);
    }

    @GetMapping(value = "/ultimoEncargado")
    public EncargadoRepresentante getUltimoEncargado(){
        return daoER.getUltimoEncargado();
    }

    @GetMapping(value = "/insertEncargado")
    public boolean insertEncargado(
            @RequestParam(name = "nombre", defaultValue = "")String nombre,
            @RequestParam(name = "rut", defaultValue = "")String rut,
            @RequestParam(name = "puesto", defaultValue = "")String puesto,
            @RequestParam(name = "telefono", defaultValue = "")String telefono,
            @RequestParam(name = "email", defaultValue = "")String email
            ){
        return daoER.insertEncargado(new EncargadoRepresentante("",nombre,rut,puesto,telefono,email));
    }

    @GetMapping(value = "/updateEncargado")
    public boolean updateEncargado(
            @RequestParam(name = "puesto", defaultValue = "")String puesto,
            @RequestParam(name = "telefono", defaultValue = "")String telefono,
            @RequestParam(name = "email", defaultValue = "")String email,
            @RequestParam(name = "idContra", defaultValue = "") String idContra
    ){
        return daoER.updateEncargado(new EncargadoRepresentante(idContra,"","",puesto,telefono,email));
    }
}
