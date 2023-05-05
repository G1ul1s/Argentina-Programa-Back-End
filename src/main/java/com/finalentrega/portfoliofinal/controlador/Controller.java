package com.finalentrega.portfoliofinal.controlador;

import com.finalentrega.portfoliofinal.entidad.Credenciales;
import com.finalentrega.portfoliofinal.entidad.Educacion;
import com.finalentrega.portfoliofinal.entidad.Experiencia;
import com.finalentrega.portfoliofinal.entidad.HyS;
import com.finalentrega.portfoliofinal.entidad.Persona;
import com.finalentrega.portfoliofinal.servicio.SHyS;
import com.finalentrega.portfoliofinal.servicio.SExperiencia;
import com.finalentrega.portfoliofinal.servicio.SEducacion;
import com.finalentrega.portfoliofinal.servicio.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
    
    @Autowired
    private PersonaService persoServ;   
    @Autowired
    private SEducacion eduServ;
    @Autowired
    private SExperiencia expServ;
    @Autowired
    private SHyS hysServ;


    //Login
   @PostMapping("/login")
    public Boolean login (@RequestBody Credenciales cred){
    return persoServ.login(cred.getEmail(), cred.getPassword());
    }
    //Persona
    @PostMapping ("/new/persona")
    public void agregarPersona (@RequestBody Persona pers){
       persoServ.crearPersona(pers);
    }
    
    @GetMapping ("/ver/persona/{id}")
     public Persona buscarPersona(@PathVariable Long id) {
        return persoServ.buscarPersona(id);
    } 
    
    @PutMapping("/update/persona")
    public void editarPersona (@RequestBody Persona per){
    persoServ.editarPersona(per);
    }
    @DeleteMapping ("/delete/{id}")
    public void borrarPersona (@PathVariable Long id){
          persoServ.borrarPersona(id);
    }
    
   //Educacion
    @PostMapping("/new/educacion/{id}")
    public void crearEducacion(@RequestBody Educacion edu, @PathVariable Persona id){
      persoServ.agregarEducacion(edu, id); 
    } 
    @GetMapping("/ver/educacion/{id}")
    public Educacion buscarEducacion (@PathVariable Long id){
        return eduServ.buscarEducacion(id);
    }
    @PutMapping ("/update/educacion")
    public void editarEducacion (@RequestBody Educacion edu){
      eduServ.editarEducacion(edu);
    }
    @DeleteMapping ("/delete/educacion/{idedu}/{idper}")
    public void borrarEducacion(@PathVariable Educacion idedu, @PathVariable Persona idper){
        persoServ.borrarEducacion(idedu,idper);
    }
    
   //Experiecia
    @PostMapping("/new/experiencia/{id}")
    public void crearExperiencia(@RequestBody Experiencia exp, @PathVariable Persona id){
      persoServ.agregarExperiencia(exp, id);
    } 
     @GetMapping("/ver/experiencia/{id}")
    public Experiencia buscarExperiencia (@PathVariable Long id){
       return expServ.buscarExperiencia(id);
    }
    @PutMapping ("/update/experiencia")
    public void editarExperiencia (@RequestBody Experiencia exp){
      expServ.editarExperiencia(exp);
    }
    @DeleteMapping ("/delete/experiencia/{idexp}/{idper}")
    public void borrarExperiencia(@PathVariable Experiencia idexp, @PathVariable Persona idper){
        persoServ.borrarExperiencia(idexp,idper);
    }
       
    //HyS
    @PostMapping("/new/hys/{id}")
    public void crearHyS(@RequestBody HyS hys, @PathVariable Persona id){
      persoServ.agregarHyS(hys, id);
    } 
    @GetMapping("/ver/hys/{id}")
    public HyS buscarHyS (@PathVariable Long id){
       return  hysServ.buscarHyS(id);
    }
    @PutMapping ("/update/hys")
    public void editarHyS (@RequestBody HyS hys){
        hysServ.editarHyS(hys);
    }
    @DeleteMapping ("/delete/hys/{idhys}/{idper}")
    public void borrarHyS(@PathVariable HyS idhys, @PathVariable Persona idper){
        persoServ.borrarHyS(idhys,idper);
    }
    
}