package com.devsuperior.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dspesquisa.entities.Genre;
@Repository
public interface GenreRepository extends JpaRepository<Genre, Long >{
//Essa interface já esta pronta para trabalhar com acesso a dadosde game, criar, atualizar, consultar, deletar.
	
}
