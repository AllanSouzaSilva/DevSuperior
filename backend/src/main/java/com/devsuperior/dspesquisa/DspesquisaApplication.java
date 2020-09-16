package com.devsuperior.dspesquisa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication 
public class DspesquisaApplication {

	//Em java nome da classe tem que ter o mesmo nome do arquivo.
//ORM: Objeto de mapeamento relacional, no java é trabalhado com objetos e o mapeamento vai fazer com que os objetos sejam mapeados para o banco de dados
	public static void main(String[] args) {
		SpringApplication.run(DspesquisaApplication.class, args);
	}

}
