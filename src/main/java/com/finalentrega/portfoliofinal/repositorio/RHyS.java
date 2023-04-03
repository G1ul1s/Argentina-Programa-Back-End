package com.finalentrega.portfoliofinal.repositorio;

import com.finalentrega.portfoliofinal.entidad.HyS;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RHyS extends JpaRepository <HyS, Integer>{
    
    Optional<HyS> findByNombre (String Nombre);
    public boolean existsByNombre (String Nombre);
 
}
