package com.example.main.ws;

import com.example.main.clases.EmpresaPasajero;
import com.example.main.dao.DAOContratoPasajero;
import com.example.main.dao.DAOEmpresaPasajero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpresaPasajeroController {
    @Autowired
    DAOEmpresaPasajero daoEP;

    @GetMapping(value = "/empresaPasajero")
    public boolean insertEmpresaPasajero(
            @RequestParam(name = "idEmpresa", defaultValue = "null") String idEmpresa,
            @RequestParam(name = "idPasajero", defaultValue = "null") String idPasajero){
        return daoEP.insertEmpresaPasajero(new EmpresaPasajero("",idEmpresa,idPasajero));
    }

    @GetMapping(value = "/getEmpresaPasajeroForIDPasajero")
    public EmpresaPasajero getEmpresaPasajero(
            @RequestParam(name = "idPasajero", defaultValue = "null")String idPasajero){

        return daoEP.getEmpresaPasajeroFORIDPasajero(idPasajero);
    }

    @GetMapping(value = "/updateEmpresaPasajero")
    public boolean updateEmpresaPasajero(
            @RequestParam(value = "idPasajero", defaultValue = "null")String idPasajero,
            @RequestParam(value = "idEmpresaNueva", defaultValue = "null")String idEmpresaNueva,
            @RequestParam(value = "idEmpresaAntigua", defaultValue = "null")String idEmpresaAntigua){

        return daoEP.updateEmpresaPasajero(idPasajero, idEmpresaNueva, idEmpresaAntigua);
    }
}
