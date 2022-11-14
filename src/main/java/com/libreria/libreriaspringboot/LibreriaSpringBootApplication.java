package com.libreria.libreriaspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.libreria.libreriaspringboot.Model.Autor;
import com.libreria.libreriaspringboot.Repository.AutorRepository;

@SpringBootApplication
public class LibreriaSpringBootApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(LibreriaSpringBootApplication.class, args);
	}

	@Autowired
	private AutorRepository repository;

	@Override
	public void run(String... args) throws Exception {
		Autor autor = new Autor();
		autor.setNombre("Antonio Banderas");
		autor.setPais("Rusia");
		repository.save(autor);
	}

}
