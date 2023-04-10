package com.finalentrega.portfoliofinal.servicio;

import com.finalentrega.portfoliofinal.entidad.HyS;
import com.finalentrega.portfoliofinal.interfa.IHyS;
import com.finalentrega.portfoliofinal.repositorio.RHyS;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SHyS implements IHyS {
    
    @Autowired
    public RHyS hysRepo;

    @Override
    public List<HyS> verHyS() {
        return hysRepo.findAll();
    }

    @Override
    public HyS crearHyS(HyS hys) {
       return hysRepo.save(hys);
    }

    @Override
    public void borrarHyS(HyS id) {
        hysRepo.delete(id);
    }

    @Override
    public HyS buscarHyS(Long id) {
        return hysRepo.findById(id).orElse(null);
    }
    @Override
    public void editarHyS (HyS hys){
        hysRepo.save(hys);
    }
}