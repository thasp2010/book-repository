package com.algaworks.bibliotecadigital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AwBibliotecadigitalApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(AwBibliotecadigitalApplication.class, args);
	}
	
	
	
}
