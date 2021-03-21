package com.example.main.ws;

import com.example.main.clases.RegistroServicio;
import com.example.main.clases.Servicio;
import com.example.main.dao.DAORegistroServicio;
import com.example.main.dao.DAOServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ServiciosController {
    @Autowired
    DAOServicio ds;

    @GetMapping(value = "/getservicios")
    public List<Servicio> getServicios(){
        return ds.getAllServicios();
    }

    @GetMapping(value = "/getservicioForId")
    public Servicio getServicioForId(@RequestParam(name = "id", defaultValue = "null")String id){
        return ds.getServicioForId(id);
    }
}
