package com.finalentrega.portfoliofinal.servicio;

import com.finalentrega.portfoliofinal.entidad.Educacion;
import com.finalentrega.portfoliofinal.interfa.IEducacionService;
import com.finalentrega.portfoliofinal.repositorio.REducacion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SEducacion implements IEducacionService {
    
    @Autowired
    public REducacion EduRepo;

    @Override
    public List<Educacion> verEducacion() {
        return EduRepo.findAll();
    }

    @Override
    public Educacion crearEducacion(Educacion edu) {
       return EduRepo.save(edu);
    }

    @Override
    public void borrarEduaccion(Educacion id) {
      EduRepo.delete(id);   //lo necesito publico para que persona lo llame//
    }

    @Override
    public Educacion buscarEducacion(Long id) {
       return EduRepo.findById(id).orElse(null);
    }
    
    @Override
    public void editarEducacion(Educacion edu){
        EduRepo.save(edu);
    }
     
}
