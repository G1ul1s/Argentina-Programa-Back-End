package com.finalentrega.portfoliofinal.controlador;

import com.finalentrega.portfoliofinal.entidad.Educacion;
import com.finalentrega.portfoliofinal.servicio.SEducacion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/educacion")
public class CEducacion {
    
    @Autowired
    private SEducacion eduServ; 
 
    @GetMapping ("/ver/educacion")
    @ResponseBody
    public List<Educacion> verEducacion (){
     return eduServ.verEducacion();
    }

}