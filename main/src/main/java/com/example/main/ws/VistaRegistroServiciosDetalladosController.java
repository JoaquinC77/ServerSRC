package com.example.main.ws;

import com.example.main.clases.VistaRegistrosServiciosDetalle;
import com.example.main.dao.DAOVistaRegistroServiciosDetallado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VistaRegistroServiciosDetalladosController {
    @Autowired
    DAOVistaRegistroServiciosDetallado daoVista;

    @GetMapping("/getRegistrosDetallados")
    public List<VistaRegistrosServiciosDetalle> getRegistrosDetallados(
            @RequestParam(value = "idContrato", defaultValue = "null") String idContrato,
            @RequestParam(value = "fechaDesde", defaultValue = "null") String fechaDesde,
            @RequestParam(value = "fechaHasta", defaultValue = "null") String fechaHasta){
        return daoVista.getDetalleRegistrosPorContrato(idContrato, fechaDesde, fechaHasta);
    }
}