package com.finalentrega.portfoliofinal.entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Educacion {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    
    private String college;
    private String title;
    private String img;
    private String description;
    private String certificate;
    
    
    public Educacion() {
    }

    public Educacion(Long id, String college, String title, String img, String description, String certificate) {
        this.id = id;
        this.college = college;
        this.title = title;
        this.img = img;
        this.description = description;
        this.certificate = certificate;
    }
    
    public boolean equals(Educacion edu){
        return this.getId().equals(edu.getId());
    }
       
}
