package com.example.main.ws;

import com.example.main.clases.ContratoPasajero;
import com.example.main.dao.DAOContratoPasajero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContratoPasajeroController {
    @Autowired
    DAOContratoPasajero daoCP;

    @GetMapping(value = "/insertContratoPasajero")
    public boolean insertContratoPasajero(
            @RequestParam(name = "idContrato", defaultValue = "null")String idContrato,
            @RequestParam(name = "idPasajero", defaultValue = "null")String idPasajero,
            @RequestParam(name = "fechaEntrada", defaultValue = "null")String fechaEntrada,
            @RequestParam(name = "fechaSalida", defaultValue = "null")String fechaSalida){

        return daoCP.insertContratoPasajero(new ContratoPasajero("",idContrato,idPasajero,fechaEntrada,fechaSalida));
    }
}
