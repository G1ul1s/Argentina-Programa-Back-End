package com.finalentrega.portfoliofinal.entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    
    private String position ;
    private String company ;
    private String img;
    private String cliente ;
    private String aplicaciones;
    private String consultas;
    private String reporte;
    private String Metodologia;
    private String funciones;
   

    public Experiencia() {
    }

    public Experiencia(Long id, String position, String company, String img, String cliente, String aplicaciones, String consultas, String reporte, String Metodologia, String funciones) {
        this.id = id;
        this.position = position;
        this.company = company;
        this.img = img;
        this.cliente = cliente;
        this.aplicaciones = aplicaciones;
        this.consultas = consultas;
        this.reporte = reporte;
        this.Metodologia = Metodologia;
        this.funciones = funciones;
    }
    
     public boolean equals(Experiencia exp){
        return this.getId().equals(exp.getId());
    }
    
}