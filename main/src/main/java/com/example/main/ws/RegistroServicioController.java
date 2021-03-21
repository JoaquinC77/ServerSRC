package com.example.main.ws;

import com.example.main.clases.RegistroServicio;
import com.example.main.dao.DAORegistroServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RegistroServicioController {
    @Autowired
    DAORegistroServicio daoRS;

    @GetMapping(value = "/registroServicio")
    public boolean insertRegistroServicio(
            @RequestParam(name = "idPas", defaultValue = "null")String idPasajero,
            @RequestParam(name = "idContra", defaultValue = "null")String idContrato,
            @RequestParam(name = "idSer", defaultValue = "null")String idServicio){
        return daoRS.insertRegistroServicio(new RegistroServicio("",idPasajero,idContrato,idServicio,""));
    }

    @GetMapping(value = "/validacionRegistroExistente")
    public boolean validacionRegistroExistente(
            @RequestParam(name = "idPasajero", defaultValue = "null")String idPasajero,
            @RequestParam(name = "idServicio", defaultValue = "null")String idServicio){
        return daoRS.getValidacionRegistroExistente(new RegistroServicio("",idPasajero,"",idServicio,""));
    }

    @GetMapping(value = "getRegistrosPorPasajero")
    public List<RegistroServicio> getRegistroServicio(
            @RequestParam(name = "idPasajero", defaultValue = "null")String idPasajero,
            @RequestParam(name = "idContrato", defaultValue = "null")String idContrato){
        return daoRS.getRegistrosPorPasajeroYContrato(idPasajero,idContrato);
    }
}
