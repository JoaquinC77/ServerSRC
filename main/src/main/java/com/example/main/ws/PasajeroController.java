package com.example.main.ws;

import com.example.main.clases.Pasajero;
import com.example.main.dao.DAOEmpresa;
import com.example.main.dao.DAOPasajero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PasajeroController {
    @Autowired
    DAOPasajero daoPasajero;

    @GetMapping("/pasajero")
    public Pasajero getPasajeroForId(@RequestParam(name = "id", defaultValue = "null") String id){
        return daoPasajero.getPasajero(id);
    }

    @GetMapping("/existeCodigoPasajero")
    public boolean existeCodigo(@RequestParam(name = "cod", defaultValue = "null") String codigo){
        return daoPasajero.existeCodigo(codigo);
    }

    @GetMapping("/pasajeroCodigo")
    public Pasajero getPasajeroPorCodigo(@RequestParam(name = "cod", defaultValue = "null") String codigo){
        return daoPasajero.getPasajeroPorCodigo(codigo);
    }

    @GetMapping("/pasajeroRut")
    public Pasajero getPasajeroForRut(@RequestParam(name = "rut", defaultValue = "null") String rut){
        return daoPasajero.getPasajeroForRut(rut);
    }

    @GetMapping("/pasajerosPorContrato")
    public List<Pasajero> getPasajerosForContrato(@RequestParam(name = "codigoContrato", defaultValue = "null") String codigoContrato){
        return daoPasajero.getPasajeroPorAsosciacionContrato(codigoContrato);
    }

    @GetMapping("/insertPasajero")
    public boolean insertPasajero(
            @RequestParam(name = "cod", defaultValue = "null")String codigo,
            @RequestParam(name = "nam", defaultValue = "null")String nombre,
            @RequestParam(name = "apeP",defaultValue = "null")String apellidoP,
            @RequestParam(name = "apeM", defaultValue = "null")String apellidoM,
            @RequestParam(name = "rut", defaultValue = "null")String rut,
            @RequestParam(name = "direc", defaultValue = "null") String direccion){
        return daoPasajero.insertPasajero(new Pasajero("",codigo,nombre,apellidoP,apellidoM,rut,direccion));
    }

    @GetMapping("/getPasajerosPorContrato")
    public int getCantidadDePasajeros(@RequestParam(value = "cod", defaultValue = "null")String cod){
        return daoPasajero.getPasajerosAsignadosAContrato(cod);
    }

}
