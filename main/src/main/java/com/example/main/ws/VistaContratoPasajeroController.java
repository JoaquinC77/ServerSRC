package com.example.main.ws;

import com.example.main.clases.VistaContratoPasajero;
import com.example.main.dao.DAOVistaContratoPasajero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VistaContratoPasajeroController {
    @Autowired
    DAOVistaContratoPasajero daoV;

    @GetMapping(value = "vistaContratos")
    public List<VistaContratoPasajero> getVistaContratos(
            @RequestParam(name = "idPasajero", defaultValue = "null")String idPasajero){
        return daoV.getVistaContrato(idPasajero);
    }
}
