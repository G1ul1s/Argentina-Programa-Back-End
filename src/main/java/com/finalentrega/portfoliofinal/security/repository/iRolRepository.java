package com.finalentrega.portfoliofinal.security.repository;

import com.finalentrega.portfoliofinal.security.Entity.Rol;
import com.finalentrega.portfoliofinal.security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository <Rol, Integer>{
 Optional<Rol> findByRolNombre (RolNombre rolNombre);   
}
