package com.devsuperior.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dspesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long >{
//Essa interface já esta pronta para trabalhar com acesso a dadosde game, criar, atualizar.
}
