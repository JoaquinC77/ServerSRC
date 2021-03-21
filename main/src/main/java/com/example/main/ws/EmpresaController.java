package com.example.main.ws;

import com.example.main.clases.Empresa;
import com.example.main.dao.DAOEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpresaController {
    @Autowired
    DAOEmpresa daoEmpresa;

    @GetMapping(value = "/empresas")
    public List<Empresa> getListEmpresa(){
        return daoEmpresa.getAllEmpresas();
    }


    @GetMapping(value = "/insertEmpresa")
    public boolean insertEmpresa(
            @RequestParam(name = "nombre", defaultValue = "null")String nombre,
            @RequestParam(name = "rut", defaultValue = "null")String rut ,
            @RequestParam(name = "direccion", defaultValue = "null") String direccion,
            @RequestParam(name = "idRepre", defaultValue = "null") String idRepre){

            return daoEmpresa.insertEmpresa(new Empresa("",nombre,rut,direccion,idRepre));
    }

    @GetMapping(value = "/updateEmpresa")
    public boolean updateEmpresa(
            @RequestParam(value = "id",defaultValue = "null")String id,
            @RequestParam(value = "nombre", defaultValue = "null")String nombre,
            @RequestParam(name = "direccion", defaultValue = "null") String direccion){

        return daoEmpresa.updateEmpresa(new Empresa(id,nombre,"",direccion,""));


    }


    @GetMapping(value = "/getEmpresaId")
    public Empresa getEmpresaForId(@RequestParam(value = "id", defaultValue = "-1")String id){
        return daoEmpresa.getEmpresaForID(id);
    }

    @GetMapping(value = "/getEmpresaIDPasajero")
    public Empresa getEmpresaIDPasajero(@RequestParam(value = "id", defaultValue = "-1")String id){
        return daoEmpresa.getEmpresaForIDPasajero(id);
    }

    @GetMapping(value = "/getEmpresaRut")
    public Empresa getEmpresaForRUT(@RequestParam(value = "rut", defaultValue = "-1")String rut){
        return daoEmpresa.getEmpresaForRUT(rut);
    }
}
