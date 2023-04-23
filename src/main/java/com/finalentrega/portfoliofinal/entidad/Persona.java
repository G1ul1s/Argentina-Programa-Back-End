package com.finalentrega.portfoliofinal.entidad;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String backImagen;
    private String imagen;
    private String position; 
    private String company; 
    private String college; 
    private String location;
    private String title1;
    private String about;
    private String title2;
    private String email;
    private String password;
        
    @OneToMany
    List<Experiencia> listExperiencia;
    
    @OneToMany
    List<Educacion> listEducacion;
    
    @OneToMany
    List<HyS> listHyS;
    

    public Persona() {
    }

    public Persona(Long id, String name, String backImagen, String imagen, String position, String company, String college, String location, String title1, String about, String title2, String email, String password) {
        this.id = id;
        this.name = name;
        this.backImagen = backImagen;
        this.imagen = imagen;
        this.position = position;
        this.company = company;
        this.college = college;
        this.location = location;
        this.title1 = title1;
        this.about = about;
        this.title2 = title2;
        this.email = email;
        this.password = password;
    }
        
        public void addExperiencia (Experiencia exp){
            this.listExperiencia.add(exp);
        }
        public void addEducacion (Educacion edu){
            this.listEducacion.add(edu);
        }
        public void addHyS (HyS hys){
            this.listHyS.add(hys);
        }
        
        public void deleteExperiencia (Experiencia exp){
            
            for(Experiencia aux : this.listExperiencia ){
            if(aux.equals(exp)){
                this.listExperiencia.remove(exp);
                break;
            }
            
            }
            
        }
         public void deleteEducacion (Educacion edu){
            
            for(Educacion aux : this.listEducacion ){
            if(aux.equals(edu)){
                this.listEducacion.remove(edu);
                break;
            }
            
            }
            
        }
        public void deleteHyS (HyS hys){
            
            for(HyS aux : this.listHyS ){
            if(aux.equals(hys)){
                this.listHyS.remove(hys);
                break;
            }
            
            }
        }
     }
