package com.example.main.ws;

import com.example.main.dao.DAOCambioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CambioServicioController {
    @Autowired
    DAOCambioServicio dcs;

    @GetMapping(value = "/getCambioServicioActualizado")
    public int getServicioActuallizado(){
        return dcs.cambioservicioautomatico();
    }

}
