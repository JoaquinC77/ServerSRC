package com.example.main.ws;

import com.example.main.clases.VistaConsultaDeCostos;
import com.example.main.dao.DAOVistaConsultaCostos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VistaConsultaCostosController {
    @Autowired
    DAOVistaConsultaCostos dcc;

    @GetMapping("/getCostos")
    public VistaConsultaDeCostos getCostosContrato(
            @RequestParam(value = "codigo", defaultValue = "null") String codigo,
            @RequestParam(value = "fechaDesde", defaultValue = "null")String fechaDesde,
            @RequestParam(value = "fechaHasta", defaultValue = "null")String fechaHasta){

        return dcc.getCostosPorContrato(codigo, fechaDesde, fechaHasta);

    }
}
