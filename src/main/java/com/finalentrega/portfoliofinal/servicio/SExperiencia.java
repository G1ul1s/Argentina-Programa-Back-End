package com.finalentrega.portfoliofinal.servicio;

import com.finalentrega.portfoliofinal.entidad.Experiencia;
import com.finalentrega.portfoliofinal.interfa.IExperienciaService;
import com.finalentrega.portfoliofinal.repositorio.PersonaRepository;
import com.finalentrega.portfoliofinal.repositorio.RExperiencia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SExperiencia implements IExperienciaService {
    
    @Autowired
    public RExperiencia ExpRepo;
    @Autowired
    public PersonaRepository persoRepo;

    @Override
    public List<Experiencia> verExperiencia() {
        return ExpRepo.findAll();
    }

    @Override
    public Experiencia crearExperiencia(Experiencia exp) {
       return  ExpRepo.save(exp);
    }

   @Override
    public void borrarExperiencia(Experiencia exp) {
        ExpRepo.delete(exp);
    }

    @Override
    public Experiencia buscarExperiencia(Long id) {
        return ExpRepo.findById(id).orElse(null);
    }
    
    @Override
    public void editarExperiencia (Experiencia exp){
        ExpRepo.save(exp);
    }
    
    
}