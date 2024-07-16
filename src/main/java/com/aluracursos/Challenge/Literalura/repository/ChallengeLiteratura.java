package com.aluracursos.Challenge.Literalura.repository;

import com.aluracursos.Challenge.Literalura.Libreria.Libreria;
import com.aluracursos.Challenge.Literalura.Libreria.iAutorRepository;
import com.aluracursos.Challenge.Literalura.Libreria.iLibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.aluracursos.Challenge.Literalura")
public class ChallengeLiteratura implements CommandLineRunner {

	@Autowired
	private iLibroRepository libroRepository;
	@Autowired
	private iAutorRepository autorRepository;

	public static void main(String[] args) {
		SpringApplication.run(ChallengeLiteratura.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Libreria libreria = new Libreria(libroRepository, autorRepository);
		libreria.consumo();

	}
}
