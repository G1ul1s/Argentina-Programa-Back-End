package com.finalentrega.portfoliofinal.servicio;

import com.finalentrega.portfoliofinal.entidad.Educacion;
import com.finalentrega.portfoliofinal.entidad.Experiencia;
import com.finalentrega.portfoliofinal.entidad.HyS;
import com.finalentrega.portfoliofinal.entidad.Persona;
import com.finalentrega.portfoliofinal.interfa.InterfacePersonaService;
import com.finalentrega.portfoliofinal.repositorio.PersonaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements InterfacePersonaService {
    
    @Autowired
    public PersonaRepository persoRepo;
    @Autowired
    public SEducacion eduServ;
    @Autowired
    public SExperiencia expServ;
    @Autowired
    public SHyS hysServ;
   
    @Override 
    public Boolean login (String password, String email){
    Boolean response = persoRepo.existsByPasswordAndEmail(password, email);
    return response;
    }
   

    @Override
    public void crearPersona(Persona per) {
        persoRepo.save(per); 
    }

    @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
        return persoRepo.findById(id).orElse(null);
    }
    
    @Override
    public void editarPersona (Persona per){
         persoRepo.save(per);
    }
    
    
   @Override
    public void agregarEducacion(Educacion edu, Persona per) {
    Educacion edu_id = eduServ.crearEducacion(edu);
    per.addEducacion(edu_id);
    persoRepo.save(per);
    }
   
    @Override
    public void agregarHyS (HyS hys, Persona per) {
    HyS hys_id = hysServ.crearHyS(hys);
    per.addHyS(hys_id);
    persoRepo.save(per);
    }
    
    @Override
    public void agregarExperiencia(Experiencia exp, Persona per) {
    Experiencia exp_id = expServ.crearExperiencia(exp);
    per.addExperiencia(exp_id);
    persoRepo.save(per);
    }
   
    @Override
    public void borrarExperiencia( Experiencia exp, Persona per){
        
        per.deleteExperiencia(exp);
        persoRepo.save(per);
        expServ.borrarExperiencia(exp);
    }
    
    @Override
    public void borrarEducacion( Educacion edu, Persona per){
        
        per.deleteEducacion(edu);
        persoRepo.save(per);
        eduServ.borrarEduaccion(edu);
    }
    
    @Override
    public void borrarHyS( HyS hys, Persona per){
        
        per.deleteHyS(hys);
        persoRepo.save(per);
        hysServ.borrarHyS(hys);
    }
}
