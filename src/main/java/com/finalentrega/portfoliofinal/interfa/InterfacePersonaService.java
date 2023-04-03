package com.finalentrega.portfoliofinal.interfa;

import com.finalentrega.portfoliofinal.entidad.Persona;
import java.util.List;

public interface InterfacePersonaService {
     
    public List<Persona> getPersona ();
    public void crearPersona (Persona per);
    public void borrarPersona (Long id);
    public void deletePersona (Long id);
    public Persona buscarPersona (Long id);

    public Persona findPersona(Long id);

    public void savePersona(Persona persona);
}
