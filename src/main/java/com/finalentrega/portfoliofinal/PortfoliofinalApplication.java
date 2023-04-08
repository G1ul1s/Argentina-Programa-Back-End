package com.finalentrega.portfoliofinal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class PortfoliofinalApplication {

		public static void main(String[] args) {
		SpringApplication.run(PortfoliofinalApplication.class, args);           
}
              
//configurando el cors para la conexion con angular
   @Bean

    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("https://argentina-programa-front-end.web.app","http://localhost:4200").allowedMethods("*").allowedHeaders("*");
            }
        };
    }
}                
