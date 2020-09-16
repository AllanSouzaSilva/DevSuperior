package com.devsuperior.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dspesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long >{
//Essa interface já esta pronta para trabalhar com acesso a dadosde game, criar, atualizar, consultar, deletar.
	
}
