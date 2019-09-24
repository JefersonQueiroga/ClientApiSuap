package br.edu.ifrn.jeferson.projetoSuap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"br.edu.ifrn.jeferson.controller","br.edu.ifrn.jeferson.resource","br.edu.ifrn.jeferson.config"})
public class ProjetoSuapApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoSuapApplication.class, args);
	}

}
