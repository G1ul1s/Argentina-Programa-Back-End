package com.finalentrega.portfoliofinal.repositorio;

import com.finalentrega.portfoliofinal.entidad.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface REducacion extends JpaRepository<Educacion, Integer>{
    
    public Optional<Educacion> findByNombreE (String NombreE);
    public boolean existsByNombreE (String NombreE);
    
}
