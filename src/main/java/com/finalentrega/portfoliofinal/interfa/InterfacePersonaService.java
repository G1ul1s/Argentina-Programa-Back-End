package com.finalentrega.portfoliofinal.interfa;

import com.finalentrega.portfoliofinal.entidad.Educacion;
import com.finalentrega.portfoliofinal.entidad.Experiencia;
import com.finalentrega.portfoliofinal.entidad.HyS;
import com.finalentrega.portfoliofinal.entidad.Persona;


public interface InterfacePersonaService {
    
    public Boolean login (String password, String email);
    
    public void crearPersona (Persona per);
    public void borrarPersona (Long id);
    public Persona buscarPersona (Long id); 
    public void editarPersona (Persona per);
    
    
    public void agregarEducacion (Educacion edu, Persona per);
    public void agregarHyS (HyS hys, Persona per);
    public void agregarExperiencia (Experiencia exp, Persona per);
    
    
    public void borrarExperiencia (Experiencia idexp, Persona idper);
    public void borrarEducacion (Educacion idedu, Persona idper);
    public void borrarHyS (HyS idhys, Persona idper);
    
}
