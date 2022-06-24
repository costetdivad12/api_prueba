package mx.edu.iebem.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.iebem.api.models.Curp;
import mx.edu.iebem.api.services.Curp_services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/curp")
public class CurpController {
    @Autowired private Curp_services service;
    
    // @GetMapping("/Consulta")
    // @RequestMapping(value = {"/Consulta1","/Consulta2"},method =RequestMethod.GET)
    // @RequestMapping(name = "/Consulta",method =RequestMethod.GET)
    // public List<Curp> getCurps() {
        
    //     return  service.Listcurp();
    // }


    @GetMapping 
    public List<Curp> getCurps1() {
        
        return  service.Listcurp();
    }

    //  request param   http://localhost:8090/v0/curp/test?curp=COSR730507MDFRNS04
    // @GetMapping("/test")
    // public Curp getCurp(@RequestParam(name = "curp") String curp){
  
    //     return service.getCurp(curp);
    // }

    @GetMapping("/{curp}")
    public Curp getCurp(@PathVariable("curp") String curp){
  
        return service.getCurp(curp);
    }
    
}
