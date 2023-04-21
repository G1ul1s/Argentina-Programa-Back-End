package com.finalentrega.portfoliofinal.controlador;

import com.finalentrega.portfoliofinal.entidad.Experiencia;
import com.finalentrega.portfoliofinal.servicio.SExperiencia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/experiencia")
public class CExperiencia {
     @Autowired
    private SExperiencia expServ; 

    @GetMapping ("/ver/experiencia")
    @ResponseBody
    public List<Experiencia> verExperiencia (){
     return expServ.verExperiencia();
 }
 }
 