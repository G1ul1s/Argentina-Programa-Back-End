package com.finalentrega.portfoliofinal.controlador;

import com.finalentrega.portfoliofinal.entidad.HyS;
import com.finalentrega.portfoliofinal.servicio.SHyS;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hys")
public class CHyS {
    @Autowired
    private SHyS hysServ; 

    
    @GetMapping ("/ver/HyS")
    @ResponseBody
    public List<HyS> verHyS (){
     return hysServ.verHyS();
    }
    
}