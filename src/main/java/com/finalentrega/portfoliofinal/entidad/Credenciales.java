package com.finalentrega.portfoliofinal.entidad;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Credenciales {
    private String email;
    private String password;
    
    public Credenciales() {
    }

    public Credenciales(String password, String email) {
        this.email = email;
        this.password = password;
    }
        
}