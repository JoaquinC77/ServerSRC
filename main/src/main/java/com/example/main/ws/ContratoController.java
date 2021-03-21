package com.example.main.ws;

import com.example.main.clases.Contrato;
import com.example.main.dao.DAOContrato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.List;

@RestController
public class ContratoController {
    @Autowired
    DAOContrato daoContrato;

    @GetMapping(value = "/contratos")
    public List<Contrato> getListContratos(@RequestParam(name = "idEmpresa", defaultValue = "-1") String idEmpresa){
        return daoContrato.getAllContratosporEmpresa(idEmpresa);
    }

    @GetMapping(value = "/contratosActivos")
    public List<Contrato> getListContratosActivos(@RequestParam(name = "idEmpresa", defaultValue = "-1") String idEmpresa) {
        return daoContrato.getAllContratosActivosPorEmpresa(idEmpresa);
    }

    @GetMapping(value = "/contratosCaducos")
    public List<Contrato> getListContratosCaducos(@RequestParam(name = "idEmpresa", defaultValue = "-1") String idEmpresa){
        return daoContrato.getContratosCaducosPorEmpresa(idEmpresa);
    }



    @GetMapping(value = "/insertContrato")
    public boolean insertContrato(
            @RequestParam(name = "codigo", defaultValue = "null")String codigo,
            @RequestParam(name = "idEmpresa", defaultValue = "null")String idEmpresa,
            @RequestParam(name = "nombre", defaultValue = "null")String nombre,
            @RequestParam(name = "idAdmin",defaultValue = "null")String idAdmin,
            @RequestParam(name = "fechaInicio",defaultValue = "null") Date fechaInicio,
            @RequestParam(name = "fechaFin",defaultValue = "null")Date fechaFin,
            @RequestParam(name = "estado",defaultValue = "null")String estado){
        return daoContrato.insertContrato(new Contrato("",codigo,idEmpresa,nombre,idAdmin,fechaInicio,fechaFin,estado));
    }

    @GetMapping(value = "/getIdContratoPorIdPasajero")
    public String getContratoForIdPasajero(@RequestParam(name = "idPasaj", defaultValue = "null")String idPasajero){
        return daoContrato.getContratoForIdPasajero(idPasajero);
    }

    @GetMapping(value = "/updateContrato")
    public boolean updateContrato(
            @RequestParam(name = "idContrato", defaultValue = "null")String idContrato,
            @RequestParam(name = "fechaInicio",defaultValue = "null")Date fechaInicio,
            @RequestParam(name = "fechaFin",defaultValue = "null")Date fechaFin){

        return daoContrato.updateContrato(new Contrato(idContrato,"","","","",fechaInicio,fechaFin,""));
    }

    @GetMapping(value = "/updateEstadoContrato")
    public boolean updateEstadoContrato(
            @RequestParam(name = "idContrato", defaultValue = "null")String idContrato,
            @RequestParam(name = "estado",defaultValue = "null")String estado){

        return daoContrato.updateContrato(new Contrato(idContrato,"","","","",null,null,estado));
    }

    @GetMapping(value = "/contratoPorId")
    public Contrato getContratoPorId(@RequestParam(name = "idContrato", defaultValue = "-1") String idContrato){
        return daoContrato.getContratoporId(idContrato);
    }

    @GetMapping(value = "/contratosPorEmpresa")
    public List<Contrato> getContratosPorEmpresa(@RequestParam(name = "idEmpresa", defaultValue = "-1")String idEmpresa){
        return daoContrato.getContratoForIDEmpresa(idEmpresa);
    }

    @GetMapping(value = "/contratoPorCodigo")
    public Contrato getContratoPorCodigo(@RequestParam(name = "codigo", defaultValue = "-1") String codigo){
        return daoContrato.getContratoporCod(codigo);
    }

    @GetMapping(value = "/existeCodigo")
    public boolean existeCodigo(
            @RequestParam(name = "codigo", defaultValue = "null")String codigo){
        return daoContrato.existeCodigo(codigo);
    }

    @GetMapping(value = "/getContratoForIDPasajero")
    public Contrato getContratoForIDPasajero(@RequestParam(name = "idPasajero", defaultValue = "null")String idPasajero){
        return daoContrato.getContratoVigenteForIDPasajero(idPasajero);
    }

    @GetMapping(value = "/getContratoForIDEmpresaIDPasajero")
    public Contrato getContratoForIDEmpresaIDContrato(
            @RequestParam(name = "idPasajero", defaultValue = "null") String idPasajero,
            @RequestParam(name = "idEmpresa", defaultValue = "null")String idEmpresa){
        return daoContrato.getContratoActivoForIDPasajeroANDIDEmpresa(idPasajero,idEmpresa);
    }



}
