package com.finalentrega.portfoliofinal.entidad;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Credenciales {
    private String password;
    private String email;

    public Credenciales() {
    }

    public Credenciales(String password, String email) {
        this.password = password;
        this.email = email;
    }
        
}