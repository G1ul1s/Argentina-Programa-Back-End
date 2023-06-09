package com.finalentrega.portfoliofinal.repositorio;

import com.finalentrega.portfoliofinal.entidad.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository <Persona, Long> {
    
    Persona findByEmail(String email);
    Boolean existsByPasswordAndEmail (String password, String email);
    
}